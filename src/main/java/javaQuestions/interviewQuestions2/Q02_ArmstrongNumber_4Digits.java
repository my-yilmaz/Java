package javaQuestions.interviewQuestions2;

import java.util.Scanner;

public class Q02_ArmstrongNumber_4Digits {
    //? Kullanicidan alinan sayinin Armstrong sayi olup olmadini kontrol eden kodu yaziniz.

    //*  Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi Armstrong sayidir
    //* (0, 1, 153, 370, 371, 407)
    //* 153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strSayi = null;
        int sayi = 0;
        boolean gecerliSayi = false;

        while (!gecerliSayi) {
            System.out.print("Bir sayi girin: ");
            strSayi = scanner.nextLine();

            try {
                sayi = Integer.parseInt(strSayi);
                gecerliSayi = true;
            } catch (NumberFormatException e) {
                System.out.println("Girdiginiz deger bir sayi degil, lutfen tekrar deneyin.");
            }
        }

        int gecici = sayi;
        int basamakSayisi = strSayi.length();
        int toplam = 0;

        while (gecici != 0) {
            int basamakDegeri = gecici % 10;
            toplam += Math.pow(basamakDegeri, basamakSayisi);
            gecici /= 10;
        }

        if (toplam == sayi) {
            System.out.println(sayi + " bir Amstrong sayidir.");
        } else {
            System.out.println(sayi + " bir Amstrong sayi degildir.");
        }
    }
}