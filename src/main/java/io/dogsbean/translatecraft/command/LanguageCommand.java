package io.dogsbean.translatecraft.command;

import io.dogsbean.translatecraft.menu.TranslateMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LanguageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            TranslateMenu.createLangMenu(player);
        } else {
            sender.sendMessage("Player only command.");
            return false;
        }
        return false;
    }
}
