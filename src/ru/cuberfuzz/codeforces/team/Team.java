package ru.cuberfuzz.codeforces.team;

import java.util.Scanner;

public class Team {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int rsl = 0;
        int tasks = scanner.nextInt();
        int count = 0;
        int value = 0;
        for (int i = 0; i < tasks; i++) {
            count = 0;
            for (int j = 0; j < 3; j++) {
                value = scanner.nextInt();
                if (value == 1) {
                    count++;
                }
            }
            if (count > 1) {
                rsl++;
            }
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Team team = new Team();
        team.solution();
    }
}
