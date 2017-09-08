package net.angusbeefgaming.beefyanticheat.event;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class onPlayerMove implements Listener {
	
	// Fly Hacking Detection
	@EventHandler
	public void flyCheck(PlayerMoveEvent event) {
		if(event.getPlayer().isFlying()) {
			if (!event.getPlayer().hasPermission("essentials.fly")) {
				if(!event.getPlayer().hasPermission("bac.bypass.fly")) {
					event.getPlayer().setFlying(false);
					event.getPlayer().kickPlayer("[BAC CHEAT DETECTION]: Kicked for Fly Hacking");
					for(Player p : Bukkit.getOnlinePlayers()) {
						if(p.hasPermission("bac.alert")) {
							p.sendMessage("[BAC CHEAT DETECTION]: Player " + event.getPlayer().getName() + " has been kicked for Fly Hacking!");
						}
					}
					return;
				}
				else {
					
				}
			}
			else {
				return;
			}
		}
		else {
			return;
		}
	}
	
}
