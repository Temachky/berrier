package org.example.start.test;

import org.bukkit.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.time.LocalDateTime;

public final class Test extends JavaPlugin implements Listener {
    Server server = getServer();
    BukkitTask x;
    World world = getServer().getWorld("test for plugin");
    WorldBorder border = world.getWorldBorder();

    @Override
    public void onEnable() {

        x = server.getScheduler().runTaskTimer(this, ()-> {

                    if (world == null) {
                        getServer().getLogger().info("похдравляю ты долбоеб");
                    }

                    Bukkit.broadcastMessage("пробуем расширить мир");
                    int date = LocalDateTime.now().getMinute();
              switch(date) {
                  case 30: {
                      border.setSize(4);
                      Bukkit.broadcastMessage("расширяем мир");
                      break;
                  }
                  case 31: {
                      border.setSize(5);
                      Bukkit.broadcastMessage("расширяем мир");
                      break;
                  }
                  case 32: {
                      border.setSize(6);
                      Bukkit.broadcastMessage("расширяем мир");
                      break;
                  }
                  case 33: {
                      border.setSize(7);
                      Bukkit.broadcastMessage("расширяем мир");
                      break;
                  }
                  case 34: {
                      border.setSize(8);
                      Bukkit.broadcastMessage("расширяем мир");
                      break;
                  }
                  case 35: {
                      border.setSize(9);
                      Bukkit.broadcastMessage("расширяем мир");
                      break;
                  }
                  case 36: {
                      border.setSize(10);
                      Bukkit.broadcastMessage("расширяем мир");
                      break;
                  }
                  case 37: {
                      border.setSize(11);
                      Bukkit.broadcastMessage("расширяем мир");
                      break;
                  }
                  default: return;
                }
              }
       ,20L, 30 * 20L);

    }

    @Override
    public void onDisable() {
       getServer().getLogger().info("ну ебать не погнали");
        x.cancel();
    }
}
