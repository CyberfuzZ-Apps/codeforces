package ru.cuberfuzz.codeforces.soldierandbananas;

import java.util.Scanner;

public class SoldierAndBananas {

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int cash = scanner.nextInt();
        int quantity = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= quantity; i++) {
            sum += price * i;
        }
        if (cash >= sum) {
            System.out.println(0);
            return;
        }
        System.out.println(sum - cash);
    }

    public static void main(String[] args) {
        SoldierAndBananas soldierAndBananas = new SoldierAndBananas();
        soldierAndBananas.solution();
    }
}
