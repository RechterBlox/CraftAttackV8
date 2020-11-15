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
        if (status.equals("djane")) {
            event.setFormat("§f§l[§d§lDJANE§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("lost")) {
            event.setFormat("§f§l[§1§lLOST§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("afk")) {
            event.setFormat("§f§l[§7§lAFK§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("redstone")) {
            event.setFormat("§f§l[§4§lREDSTONE§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("god")) {
            event.setFormat("§f§l[§6§lGOD§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("boom")) {
            event.setFormat("§f§l[§4§lBOOM§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("aufnahme")) {
            event.setFormat("§f§l[§4§lAUFNAHME§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("fein")) {
            event.setFormat("§f§l[§a§lFEIN§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("geilo")) {
            event.setFormat("§f§l[§e§lGEILO§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("livestream")) {
            event.setFormat("§f§l[§1§lLIVE§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("pepega")) {
            event.setFormat("§f§l[§a§lPepega§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("ratte")) {
            event.setFormat("§f§l[§7§lRATTE§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else if (status.equals("rp")) {
            event.setFormat("§f§l[§d§lRP§f§l]§f<"+player.getName()+"> " + event.getMessage());
        } else {
            event.setFormat("<"+player.getName()+"> "+event.getMessage());
        }
    }
}
