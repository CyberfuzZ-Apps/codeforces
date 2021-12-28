package ru.cuberfuzz.codeforces;

import java.util.Scanner;

public class Translate {

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String rsl = null;
        if (first.length() == 1 && second.length() == 1 && first.equals(second)) {
            rsl = "YES";
        } else if (first.length() != second.length()) {
            rsl = "NO";
        } else {
            StringBuilder stringBuilder = new StringBuilder(second).reverse();
            rsl = first.equals(stringBuilder.toString()) ? "YES" : "NO";
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Translate translate = new Translate();
        translate.solution();
    }
}
