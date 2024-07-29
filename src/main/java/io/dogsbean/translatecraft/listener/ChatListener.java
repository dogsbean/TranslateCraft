package io.dogsbean.translatecraft.listener;

import io.dogsbean.translatecraft.Main;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {
    private final Main plugin;
    private final Translate translate;

    public ChatListener(Main plugin) {
        this.plugin = plugin;
        this.translate = TranslateOptions.getDefaultInstance().getService();
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        String originalMessage = event.getMessage();
        String translatedMessage = translateMessage(originalMessage, "en");

        event.setMessage(translatedMessage + ChatColor.GREEN + ChatColor.BOLD + " (Translated)");
    }

    private String translateMessage(String message, String targetLanguage) {
        Translation translation = translate.translate(
                message,
                Translate.TranslateOption.targetLanguage(targetLanguage),
                Translate.TranslateOption.model("base")
        );
        return translation.getTranslatedText();
    }
}
