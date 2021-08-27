package ru.cuberfuzz.codeforces.toolongwords;

import java.util.Scanner;

public class TooLongWords {
    public void solution(String word) {
        if (word.length() <= 10) {
            System.out.println(word);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(word.charAt(0));
        sb.append(word.length() - 2);
        sb.append(word.charAt(word.length() - 1));
        System.out.println(sb);
    }

    public static void main(String[] args) {
        TooLongWords tooLongWords = new TooLongWords();
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        while (scanner.hasNextLine()) {
            tooLongWords.solution(scanner.nextLine());
        }
    }
}
