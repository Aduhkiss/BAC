package net.angusbeefgaming.beefyanticheat;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static Main plugin;
	@Override
	public void onEnable() {
		getLogger().info("Beefy Anti-Cheat is Ready!");
		// Register the Fly Check event
		getServer().getPluginManager().registerEvents(this, new net.angusbeefgaming.beefyanticheat.event.onPlayerMove(), this);
		// Register the Gamemode Check Event
		getServer().getPluginManager().registerEvents(this, new net.angusbeefgaming.beefyanticheat.event.gamemodeCheck(), this);
	}
	@Override
	public void onDisable() {
		getLogger().warning("Beefy Anti-Cheat has been Disabled!");
	}
}
