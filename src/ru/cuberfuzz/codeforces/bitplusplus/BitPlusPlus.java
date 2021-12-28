package ru.cuberfuzz.codeforces.bitplusplus;

import java.util.Scanner;

public class BitPlusPlus {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String command = scanner.nextLine();
            if (command.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        BitPlusPlus bitPlusPlus = new BitPlusPlus();
        bitPlusPlus.solution();
    }
}
