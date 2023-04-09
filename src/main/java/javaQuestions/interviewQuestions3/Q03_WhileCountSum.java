package javaQuestions.interviewQuestions3;

import java.util.Scanner;

public class Q03_WhileCountSum {
    /**
     TODO: Kullanicidan toplanmak uzere sayilar isteyin sayi adedi 10'u gecerse veya toplam 500 'u gecerse
           bu kadar sayi yeter  ".. adet sayi girdin, toplami..." yazdirin
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;

        while (sayac < 10 && toplam < 500) {
            System.out.print("Bir sayi girin: ");
            int sayi = scanner.nextInt();
            toplam += sayi;
            sayac++;
        }

        System.out.println(sayac + " adet sayi girdiniz, toplamlari " + toplam);
    }
}


