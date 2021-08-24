package ru.cuberfuzz.codeforces.watermelon;

import java.util.Scanner;

public class Watermelon {

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if (w % 2 == 0 && w != 2) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        Watermelon watermelon = new Watermelon();
        watermelon.solution();
    }
}
