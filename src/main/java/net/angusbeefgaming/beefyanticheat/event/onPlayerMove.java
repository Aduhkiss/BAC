package net.angusbeefgaming.beefyanticheat.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import net.angusbeefgaming.beefyanticheat.Main;

public class onPlayerMove implements Listener {
	@EventHandler
	public void whenPlayerMove(PlayerMoveEvent event) {
		if(event.getPlayer().isFlying()) {
			if (!event.getPlayer().hasPermission("essentials.fly")) {
				if(!event.getPlayer().hasPermission("bac.bypass.fly")) {
					event.getPlayer().setFlying(false);
					event.getPlayer().kickPlayer("");
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
