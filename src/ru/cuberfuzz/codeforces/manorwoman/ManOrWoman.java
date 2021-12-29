package ru.cuberfuzz.codeforces.manorwoman;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Класс ManOrWoman
 *
 * @author Evgeniy Zaytsev
 * @version 1.0
 */
public class ManOrWoman {

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Set<Character> rsl = new HashSet<>();
        for (int i = 0; i < name.length(); i++) {
            rsl.add(name.charAt(i));
        }
        if (rsl.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }

    public static void main(String[] args) {
        ManOrWoman manOrWoman = new ManOrWoman();
        manOrWoman.solution();
    }
}
