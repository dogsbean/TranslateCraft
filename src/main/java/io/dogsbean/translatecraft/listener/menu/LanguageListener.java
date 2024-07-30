package io.dogsbean.translatecraft.listener.menu;

import io.dogsbean.translatecraft.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class LanguageListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        ItemStack clicked = e.getCurrentItem();
        Player player = (Player) e.getWhoClicked();

        if (!e.getInventory().getTitle().equalsIgnoreCase(ChatColor.GREEN + "Select the language")) {
            return;
        }

        e.setCancelled(true);
        player.closeInventory();
        Main.getInstance().getLanguageManager().setLangMap(player, clicked.getItemMeta().getDisplayName());
    }
}
