package de.blox.listener;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.File;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        File file = new File("plugins/CraftAttack/status");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        String status = (String) cfg.get(player.getUniqueId().toString());
        if (status.equals("djane")) {
            player.sendMessage("§aDein Status ist aktuell auf §cDjane gesetzt!");
        } else if (status.equals("lost")) {
            player.sendMessage("§aDein Status ist aktuell auf §cLost gesetzt!");
        } else if (status.equals("afk")) {
            player.sendMessage("§aDein Status ist aktuell auf §cAfk gesetzt!");
        } else if (status.equals("redstone")) {
            player.sendMessage("§aDein Status ist aktuell auf §cRedstone gesetzt!");
        } else if (status.equals("god")) {
            player.sendMessage("§aDein Status ist aktuell auf §cGod gesetzt!");
        } else if (status.equals("boom")) {
            player.sendMessage("§aDein Status ist aktuell auf §cBoom gesetzt!");
        } else if (status.equals("aufnahme")) {
            player.sendMessage("§aDein Status ist aktuell auf §cAufnahme gesetzt!");
        } else if (status.equals("fein")) {
            player.sendMessage("§aDein Status ist aktuell auf §cFein gesetzt!");
        } else if (status.equals("geilo")) {
            player.sendMessage("§aDein Status ist aktuell auf §cGeilo gesetzt!");
        } else if (status.equals("livestream")) {
            player.sendMessage("§aDein Status ist aktuell auf §cLivestream gesetzt!");
        } else if (status.equals("pepega")) {
            player.sendMessage("§aDein Status ist aktuell auf §cPepega gesetzt!");
        } else if (status.equals("ratte")) {
            player.sendMessage("§aDein Status ist aktuell auf §cRatte gesetzt!");
        } else if (status.equals("rp")) {
            player.sendMessage("§aDein Status ist aktuell auf §cRp gesetzt!");
        }

    }
}
