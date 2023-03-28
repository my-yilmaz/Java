package basicpractice.practice08;

import java.util.Scanner;

public class C04_IlkSonRakamToplami {
    public static void main(String[] args) {
        /**

         Kullanicidan alacaginiz 4 basamakli bir sayinin ilk ve son rakaminin toplamini
         yazdiran kodu olusturunuz.

         INPUT : 1234                4698
         OUTPUT : 1+4 =5             4+8 =12

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen 4 basamaklı bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int ilkRakam = sayi / 1000;  //* Sayının ilk rakamı
        int sonRakam = sayi % 10;    //* Sayının son rakamı
        int toplam = ilkRakam + sonRakam;

        System.out.println("İlk ve son rakamın toplamı: " + toplam);

        scanner.close();
    }
}
