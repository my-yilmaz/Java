package basicpractice.practice01;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //? Example 1: Kullanicidan ad, soyad, memleket, konum, yas, boy, kilo, Javayi sevdiniz mi bilgileri alin.
        Scanner input= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=input.nextLine();

        System.out.println("lutfen soyadinizi giriniz");
        String soyad=input.nextLine();

        System.out.println("lutfen memleketinizi giriniz");
        String memleket= input.nextLine();

        System.out.println("lutfen konumunuzu giriniz");
        String konum=input.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        byte yas=input.nextByte();

        System.out.println("lutfen boyunuzu giriniz");
        short boy=input.nextShort();

        System.out.println("lutfen javayi sevip sevmediginizi giriniz");
        boolean seviyorMu=input.nextBoolean();
    }
}

