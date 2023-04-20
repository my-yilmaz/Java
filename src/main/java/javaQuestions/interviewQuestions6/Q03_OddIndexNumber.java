package javaQuestions.interviewQuestions6;

import java.util.Scanner;

public class Q03_OddIndexNumber {
    //todo: indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin giriniz: ");
        String metin = scanner.nextLine();

        for (int i = 0; i < metin.length(); i++) {
            if (i % 2 == 1) {// index tek sayı ise
                System.out.print(metin.charAt(i));
            }
        }

    }

}
