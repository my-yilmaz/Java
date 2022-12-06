package basicpractice.practice05;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        //? Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
        //? Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        //? calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz" + "\n Kadin icin K \n erkek icin E harfini giriniz");
        char cinsiyet = input.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = input.nextDouble();

        if (yas < 0 || yas > 120) {
            System.out.println("Geçersiz yaş girdiniz.");
        } else if (cinsiyet == 'K' && yas > 60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet == 'E' && yas > 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olamazsın");
        }
    }
}
