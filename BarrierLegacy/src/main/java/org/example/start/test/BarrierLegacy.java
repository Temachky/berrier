package org.example.start.test;

import org.bukkit.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class BarrierLegacy extends JavaPlugin implements Listener {
    BukkitTask x;
    World world = getServer().getWorld("barrier");

    @Override
    public void onEnable() {

        if (world == null) {
            getServer().getLogger().info("мир не найден");
        }

        x = getServer().getScheduler().runTaskTimer(this, new Barrier(), 86400 * 20, 86400 * 20);
    }

    @Override
    public void onDisable() {
       getServer().getLogger().info("заканчиваем работу");
        x.cancel();
    }
}
