package myTasks.task03;

import java.util.Scanner;

public class TC_05_NumberSpelling {

    //? Kullanicidan 3 basamakli sayi isteyip bu sayinin okunusunu yazdiran programi kodlayiniz.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi;
        boolean gecerliSayi = false;

        while (!gecerliSayi) {
            System.out.print("Üç basamaklı bir sayı girin: ");
            sayi = scanner.nextInt();

            if (sayi >= 100 && sayi <= 999) {
                gecerliSayi = true;

                int birler = sayi % 10;
                int onlar = (sayi / 10) % 10;
                int yuzler = sayi / 100;

                String[] birlerBasamagi = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
                String[] onlarBasamagi = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
                String[] yuzlerBasamagi = {"", "yüz", "iki yüz", "üç yüz", "dört yüz", "beş yüz", "altı yüz", "yedi yüz", "sekiz yüz", "dokuz yüz"};

                String okunus = yuzlerBasamagi[yuzler] + " " + onlarBasamagi[onlar] + " " + birlerBasamagi[birler];
                System.out.println("Sayının okunuşu: " + okunus);
            } else {
                System.out.println("Hatalı giriş! Üç basamaklı bir sayı girin.");
            }
        }
    }
}