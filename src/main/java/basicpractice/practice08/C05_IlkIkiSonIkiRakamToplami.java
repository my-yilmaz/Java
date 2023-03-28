package basicpractice.practice08;

import java.util.Scanner;

public class C05_IlkIkiSonIkiRakamToplami {
    /**
     * INTERWIEW QUESTIONS
     * Kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2
     * rakamlarinin toplamini hesaplatan kodu yaziniz
     * INPUT : 12345
     * OUTPUT : 1+2+4+5= 12
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen 5 basamaklı bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int ilkIkiRakam = sayi / 1000;      // Sayının ilk 2 rakamı
        int sonIkiRakam = sayi % 100;       // Sayının son 2 rakamı
        int toplam = ilkIkiRakam / 10 + ilkIkiRakam % 10 + sonIkiRakam / 10 + sonIkiRakam % 10;

        System.out.println("İlk 2 ve son 2 rakamların toplamı: " + toplam);

        scanner.close();

    }

}
