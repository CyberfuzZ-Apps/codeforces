package ru.cuberfuzz.codeforces.layingdominoes;

import java.util.Scanner;

public class LayingDominoes {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int rsl = m * n / 2;
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        LayingDominoes layingDominoes = new LayingDominoes();
        layingDominoes.solution();
    }
}
