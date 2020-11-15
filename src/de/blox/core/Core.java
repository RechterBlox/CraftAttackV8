package de.blox.core;

import de.blox.commands.StatusCommand;
import de.blox.commands.StatusTabCompleter;
import de.blox.listener.ChatListener;
import de.blox.listener.PlayerBedListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ChatListener(), this);
        pluginManager.registerEvents(new PlayerBedListener(), this);
        getCommand("status").setExecutor(new StatusCommand());
        getCommand("status").setTabCompleter(new StatusTabCompleter());
    }
}
