package net.angusbeefgaming.beefyanticheat.event;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class gamemodeCheck implements Listener {
	@EventHandler
	public void whenPlayerGameModeUpdate(PlayerGameModeChangeEvent event) {
		Player player = event.getPlayer();
		GameMode gamemode = event.getNewGameMode();
		if(event.getNewGameMode() == GameMode.CREATIVE) {
			if(player.hasPermission("bac.gamemode.creative")) {
				return;
			}
			else {
				player.setGameMode(GameMode.SURVIVAL);
				player.kickPlayer("[BAC CHEAT DETECTION]: Kicked for using Creative Mode.");
				// Send an alert to all staff
				for(Player p : Bukkit.getOnlinePlayers()) {
					if(p.hasPermission("bac.alert")) {
						p.sendMessage("[BAC CHEAT DETECTION]: Player " + event.getPlayer().getName() + " has been kicked for having creative mode!");
					}
				}
				return;
			}
		}
		else {
			return;
		}
	}
}
