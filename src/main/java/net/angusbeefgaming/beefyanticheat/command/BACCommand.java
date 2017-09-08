package net.angusbeefgaming.beefyanticheat.command;

import java.util.Arrays;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

public class BACCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		String arg1 = args[0];
		String arg2 = args[1];
		if(args.length < 1) {
			sender.sendMessage(ChatColor.BLUE + "This Server is protected by BAC by Atticus Zambrana");
			return true;
		}
		return true;
	}

}
