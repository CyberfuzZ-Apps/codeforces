package ru.cuberfuzz.codeforces.newyearandrush;

import java.time.LocalTime;
import java.util.Scanner;

public class NewYearAndRush {
    private final LocalTime midnight = LocalTime.of(0, 0);
    private final LocalTime beginTime = LocalTime.of(20, 0);

    public void solutions(int tasks, int minutes) {
//        Scanner scanner = new Scanner(System.in);
//        int tasks = scanner.nextInt();
//        int minutes = scanner.nextInt();
        int rsl = 0;
        int timeToTasks = 0;
        LocalTime limit = midnight.minusMinutes(minutes);
        for (int i = 1; i <= tasks; i++) {
            timeToTasks += 5 * i;
            if (beginTime.plusMinutes(timeToTasks).isBefore(limit)
                    && beginTime.plusMinutes(timeToTasks).isAfter(beginTime)
                    || beginTime.plusMinutes(timeToTasks).equals(limit)) {
                rsl++;
                continue;
            }
            break;
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        var ny = new NewYearAndRush();
        ny.solutions(10, 1);
    }
}
