package co.akoot.plugins.choco

import org.bukkit.plugin.java.JavaPlugin

class Choco : JavaPlugin() {

    override fun onEnable() {
        logger.info("Tell me about it!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}