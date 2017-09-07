package net.angusbeefgaming.beefyanticheat.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import net.angusbeefgaming.beefyanticheat.Main;

public class onPlayerMove implements Listener {
	@EventHandler
	public void whenPlayerGameModeUpdate(PlayerGameModeChangeEvent event) {
		Player player = event.getPlayer();
		GameMode gamemode = event.getNewGameMode();
		if(player.getGameMode() == GameMode.CREATIVE) {
			if(player.hasPermission("bac.gamemode.creative")) {
				return;
			}
			else {
				player.setGameMode(GameMode.SURVIVAL);
				player.kickPlayer("[BAC CHEAT DETECTION]: Kicked for using Creative Mode.");
				return;
			}
		}
		else {
			return;
		}
	}
}
