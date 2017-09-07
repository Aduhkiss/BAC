package net.angusbeefgaming.beefyanticheat;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Beefy Anti-Cheat is Ready!");
	}
	@Override
	public void onDisable() {
		getLogger().warning("Beefy Anti-Cheat has been Disabled!");
	}
}
