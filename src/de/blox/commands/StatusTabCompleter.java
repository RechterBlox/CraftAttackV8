package de.blox.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class StatusTabCompleter implements TabCompleter {

    List<String> arguments = new ArrayList<String>();
    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (arguments.isEmpty()) {
            arguments.add("djane"); arguments.add("lost");
            arguments.add("afk"); arguments.add("redstone");
            arguments.add("god"); arguments.add("boom");
            arguments.add("fein"); arguments.add("aufnahme");
            arguments.add("geilo"); arguments.add("livestream");
            arguments.add("pepega"); arguments.add("ratte");
            arguments.add("rp");
        }
        List<String> result = new ArrayList<String>();
        if (args.length == 1) {
            for (String a : arguments) {
                if (a.toLowerCase().startsWith(args[0].toLowerCase()))
                    result.add(a);
            }
            return result;
        }

        return arguments;
    }
}
