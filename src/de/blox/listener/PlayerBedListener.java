package de.blox.listener;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class PlayerBedListener implements Listener {

    @EventHandler
    public void enterBed(PlayerBedEnterEvent event) {
        int sleepingplayers = 0;
        int drittel = event.getPlayer().getWorld().getPlayers().size() / 3;

        if (!event.getPlayer().getWorld().getName().equals("world_nether")) {
            if (event.getPlayer().getWorld().getTime() >= 12250){
                sleepingplayers++;
                if (sleepingplayers < 3) {
                    Bukkit.broadcastMessage("§aAktuell liegen §c" + sleepingplayers + "§a/§c1 §aSpieler im Bett (" + event.getPlayer().getWorld().getPlayers().size() + " Spieler auf der Welt)");
                } else if (sleepingplayers > 3) {
                    Bukkit.broadcastMessage("§aAktuell liegen §c" + sleepingplayers + "§a/§c" + drittel + " §aSpieler im Bett (" + event.getPlayer().getWorld().getPlayers().size() + " Spieler auf der Welt)");
                }
                if (sleepingplayers == drittel || sleepingplayers > drittel) {
                    for (World world : Bukkit.getWorlds()){
                        world.setTime(0);
                    }
                }
            }
        }
    }
}
