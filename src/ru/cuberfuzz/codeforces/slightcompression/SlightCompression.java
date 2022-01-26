package ru.cuberfuzz.codeforces.slightcompression;

import java.math.BigDecimal;
import java.util.Scanner;

public class SlightCompression {

    public static void main(String[] args) {
        SlightCompression slightCompression = new SlightCompression();
        slightCompression.solution();
    }

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < quantity; i++) {
            String strNum = scanner.nextLine();
            String[] strNumArray = strNum.split("");
            BigDecimal max = null;
            String strResult = "";
            for (int j = 0; j < strNumArray.length - 1; j++) {
                StringBuilder stringBuilder = new StringBuilder();
                int first = Integer.parseInt(strNumArray[j]);
                int second = Integer.parseInt(strNumArray[j + 1]);
                int tmp = first + second;
                if (j == 0) {
                    stringBuilder.append(tmp).append(strNum.substring(j + 2));
                    max = new BigDecimal(stringBuilder.toString());
                } else {
                    stringBuilder.append(strNum, 0, j).append(tmp);
                    if (j != strNumArray.length - 2) {
                        stringBuilder.append(strNum.substring(j + 2));
                    }
                }

                BigDecimal rsl = new BigDecimal(stringBuilder.toString());

                max = max.compareTo(rsl) > 0 ? max : rsl;

                strResult = max.toPlainString();
            }
            System.out.println(strResult);
        }
    }
}
