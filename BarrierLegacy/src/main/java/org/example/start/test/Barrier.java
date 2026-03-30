package org.example.start.test;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldBorder;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Barrier implements Runnable {
    World world = Bukkit.getWorld("barrier");
    WorldBorder border = world.getWorldBorder();

    @Override
    public void run() {
        border.setSize(border.getSize() + 2);
    }
}
