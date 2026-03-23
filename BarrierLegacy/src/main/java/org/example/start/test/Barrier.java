package org.example.start.test;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldBorder;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Barrier implements Runnable{
    World world = Bukkit.getWorld("barrier");
    WorldBorder border = world.getWorldBorder();

    int[] borders = {11, -11, 6, -6, 9, -9, 5, -5, 12, -12, 10, -10, 13, -13, 8, -8};
    int[] borders_plus = {11,6,9,5,12,10,13,8};
    int[] borders_minus = {-11,-6,-9,-5,-12,-10,-13,-8};

    int min = 0;


    @Override
    public void run() {
        LocalDate date = LocalDate.now();
        DayOfWeek WeekDay = date.getDayOfWeek();
        int day = WeekDay.getValue();

        if(day == 5) {

            double bor = border.getSize();

            if (bor <= 14)
            {
                bor = bor + borders_plus[Random(borders_plus)];
                border.setSize(bor);
            }

           else if (bor >= 80)
            {
                bor = bor + borders_minus[Random(borders_minus)];
                border.setSize(bor);
            }

           else {
               bor = bor + borders[Random(borders)];
               border.setSize(bor);
            }
        }
    }

    public int Random(int[] x) {
        int random = (int) (Math.random() * (x.length - min + 1)) + min;
        return random;
    }
}
