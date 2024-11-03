package winlyps.noWeatherCycle

import org.bukkit.plugin.java.JavaPlugin

class NoWeatherCycle : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doWeatherCycle", "false")
        }
        logger.info("NoWeatherCycle plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doWeatherCycle", "true")
            logger.info("NoWeatherCycle plugin has been disabled.")
        }
    }
}