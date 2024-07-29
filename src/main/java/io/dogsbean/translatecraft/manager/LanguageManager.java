package io.dogsbean.translatecraft.manager;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class LanguageManager {

    public Map<Player, String> langMap;

    public LanguageManager() {
        this.langMap = new HashMap<>();
    }

    public void setLangMap(Player player, String displayName) {
        langMap.put(player, displayName);
    }
}
