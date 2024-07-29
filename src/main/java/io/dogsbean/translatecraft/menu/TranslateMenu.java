package io.dogsbean.translatecraft.menu;

import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

@UtilityClass
public class TranslateMenu {

    public void createLangMenu(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 9, ChatColor.GREEN + "Select the language");

        ItemStack english = new ItemStack(Material.PAPER);
        ItemMeta englishM = english.getItemMeta();;
        englishM.setDisplayName(ChatColor.BLUE + "English");
        english.setItemMeta(englishM);

        inventory.setItem(4, english);

        player.openInventory(inventory);
    }
}
