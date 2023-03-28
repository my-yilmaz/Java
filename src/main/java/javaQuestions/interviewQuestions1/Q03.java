package javaQuestions.interviewQuestions1;

import java.util.Scanner;

public class Q03 {
    //? Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        do {
            System.out.print("Pozitif bir sayı giriniz: ");
            sayi = scanner.nextInt();
        } while (sayi <= 0);

        boolean asalMi = asalMi(sayi);

        if (asalMi) {
            System.out.println(sayi + " sayısı asaldır.");
        } else {
            System.out.println(sayi + " sayısı asal değildir.");
        }
    }

    public static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        for (int i = 2; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }
}
