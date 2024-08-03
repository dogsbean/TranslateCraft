package io.dogsbean.translatecraft;

import io.dogsbean.translatecraft.command.LanguageCommand;
import io.dogsbean.translatecraft.listener.ChatListener;
import io.dogsbean.translatecraft.listener.menu.LanguageListener;
import io.dogsbean.translatecraft.manager.LanguageManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Getter
    public static Main instance;

    @Getter
    private LanguageManager languageManager;

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new ChatListener(this), this);
        getServer().getPluginManager().registerEvents(new LanguageListener(), this);
        getCommand("language").setExecutor(new LanguageCommand());
        languageManager = new LanguageManager();
    }
}
