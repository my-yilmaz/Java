package basicpractice.practice08;

import java.util.Scanner;

public class C03_BasamaklaraAyirma {
    public static void main(String[] args) {
        /**
         Kullanicidan 3 basamakli bir sayi alin  sayinin rakamlarini birler, onlar, yuzler basamagi olarak yazdirin

         INPUT : 568
         OUTPUT: Birler Basamagi 8
         Onlar Basamagi 6
         Yuzler Basamagi 5
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen 3 basamaklı bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int yuzler = sayi / 100;
        int onlar = (sayi / 10) % 10;
        int birler = sayi % 10;

        System.out.println("Yüzler basamağı: " + yuzler);
        System.out.println("Onlar basamağı: " + onlar);
        System.out.println("Birler basamağı: " + birler);

        scanner.close();

    }
}
