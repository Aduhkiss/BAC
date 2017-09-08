package net.angusbeefgaming.beefyanticheat.command;

import java.lang.reflect.Array;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

public class BACBroadcast implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender.hasPermission("bac.brodcast")) {
			if(args.length == 0) {
				sender.sendMessage(ChatColor.RED + "[BAC CHEAT DETECTION]: You need to define a message to send!");
				return false;
			}
			else {
				StringBuilder buffer = new StringBuilder();

				// change the starting i value to pick what argument to start from
				// 1 is the 2nd argument.
				for(int i = 0; i < args.length; i++)
				{
				    buffer.append(' ').append(args[i]);
				}
				String message = buffer.toString();
				Bukkit.getServer().broadcastMessage(ChatColor.BLACK + "[" + ChatColor.GREEN + "BAC CHEAT DETECTION" + ChatColor.BLACK + "]: " + ChatColor.RED + message);
				sender.sendMessage(ChatColor.GREEN + "Successfully Sent message to all players!");
				return true;
			}
		}
		else {
			sender.sendMessage(ChatColor.RED + "[BAC CHEAT DETECTION]: You dont have access to this!");
			return false;
		}
	}

}
