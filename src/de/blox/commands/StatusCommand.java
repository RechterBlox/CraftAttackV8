package de.blox.commands;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StatusCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player player = (Player) sender;

        if (args.length == 1) {
            File file = new File("plugins/CraftAttack/status");
            FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
            String playeruuid = player.getUniqueId().toString();
            if (!file.exists()) {
                try { file.createNewFile(); } catch (IOException e) { }
            }
            if (args[0].equalsIgnoreCase("djane")) {
                cfg.set(playeruuid, "djane");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("lost")) {
                cfg.set(playeruuid, "lost");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("afk")) {
                cfg.set(playeruuid, "afk");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("redstone")) {
                cfg.set(playeruuid, "redstone");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("god")) {
                cfg.set(playeruuid, "god");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("boom")) {
                cfg.set(playeruuid, "boom");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("fein")) {
                cfg.set(playeruuid, "fein");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("aufnahme")) {
                cfg.set(playeruuid, "aufnahme");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("geilo")) {
                cfg.set(playeruuid, "geilo");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("livestream")) {
                cfg.set(playeruuid, "livestream");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("pepega")) {
                cfg.set(playeruuid, "pepega");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("ratte")) {
                cfg.set(playeruuid, "ratte");
                try { cfg.save(file); } catch (IOException e) { }
            } else if (args[0].equalsIgnoreCase("rp")) {
                cfg.set(playeruuid, "rp");
                try { cfg.save(file); } catch (IOException e) { }
            }
        }
        return false;
    }
}
