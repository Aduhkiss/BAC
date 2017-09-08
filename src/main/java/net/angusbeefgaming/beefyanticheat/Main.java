package net.angusbeefgaming.beefyanticheat;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static Main plugin;
	public String prefix = "[BAC CHEAT DETECTION]: ";
	
	
	@Override
	public void onEnable() {
		getLogger().info("Beefy Anti-Cheat is Ready!");
		// Register the BAC Command
		getCommand("bac").setExecutor(new net.angusbeefgaming.beefyanticheat.command.BACCommand());
		// Register /baccast Command
		getCommand("baccast").setExecutor(new net.angusbeefgaming.beefyanticheat.command.BACBroadcast());
		// Register the Speed check event
		getServer().getPluginManager().registerEvents(new net.angusbeefgaming.beefyanticheat.event.onPlayerMove(), this);
		// Register the Gamemode Check Event
		getServer().getPluginManager().registerEvents(new net.angusbeefgaming.beefyanticheat.event.gamemodeCheck(), this);
	}
	@Override
	public void onDisable() {
		getLogger().warning("Beefy Anti-Cheat has been Disabled!");
	}
}
