package de.blox.listener;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.io.File;
import java.io.IOException;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        File file = new File("plugins/CraftAttack/status");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        String status = (String) cfg.get(player.getUniqueId().toString()); 
        event.setFormat(switch (day) //Java 12 switch expr
        {
            case "djane" -> "§f§l[§d§lDJANE§f§l]§f<";
            case "lost" -> "§f§l[§1§lLOST§f§l]§f<";
            case "afk" -> "§f§l[§7§lAFK§f§l]§f<";
            case "redstone" -> "§f§l[§4§lREDSTONE§f§l]§f<";
            case "god" -> "§f§l[§6§lGOD§f§l]§f<";
            case "boom" -> "§f§l[§4§lBOOM§f§l]§f<";
            case "aufnahme" -> "§f§l[§4§lAUFNAHME§f§l]§f<";
            case "fein" -> "§f§l[§a§lFEIN§f§l]§f<";
            case "geilo" -> "§f§l[§e§lGEILO§f§l]§f<";
            case "livestream" -> "§f§l[§1§lLIVE§f§l]§f<";
            case "pepega" -> "§f§l[§a§lPepega§f§l]§f<";
            case "ratte" -> "§f§l[§7§lRATTE§f§l]§f<";
            case "rp" -> "§f§l[§d§lRP§f§l]§f<";     
            default -> "<";
        } + player.getName()+"> " + event.getMessage());
    }
}
