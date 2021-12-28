package ru.cuberfuzz.codeforces.stonesontable;

import java.util.Scanner;

/**
 * Класс StoneOnTable
 *
 * @author Evgeniy Zaytsev
 * @version 1.0
 */
public class StoneOnTable {

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int numsOfStones = Integer.parseInt(scanner.nextLine());
        String stonesStr = scanner.nextLine();
        String[] stonesArray = stonesStr.split("");
        if (numsOfStones == 1) {
            System.out.println(0);
            return;
        }
        int count = 0;
        for (int i = 0; i < numsOfStones - 1; i++) {
            if (stonesArray[i].equals(stonesArray[i + 1])) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        StoneOnTable stoneOnTable = new StoneOnTable();
        stoneOnTable.solution();
    }
}
