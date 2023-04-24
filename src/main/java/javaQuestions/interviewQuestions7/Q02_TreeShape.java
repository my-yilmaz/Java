package javaQuestions.interviewQuestions7;

import java.util.Scanner;

public class Q02_TreeShape {
   /*
   TODO:  Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
          Not :govde sabit sayi olsun
    tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Agacin tac uzunlugunu giriniz: ");
        int tacUzunlugu = scanner.nextInt();

        for (int i = 1; i <= tacUzunlugu; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= tacUzunlugu / 2; j++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}