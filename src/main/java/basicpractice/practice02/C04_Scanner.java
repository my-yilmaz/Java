package basicpractice.practice02;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //? Example 1: Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basmakli bir sayi giriniz.");
        int sayi = scan.nextInt();

        //** bir sayinin birler basamagindaki rakami %10 ile hesaplatabiliriz.
        int sonRakam = sayi % 10;
        int ilkRakam = sayi / 1000;
        System.out.println("ilk rakam + son rakam " + (ilkRakam + sonRakam));


        //? Example 2: Kullanicidan uc basamakli bir sayi alin ve  sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

        System.out.println("uc basamakli bir sayi giriniz.");

        //** birler basamagindaki rakami bulmak icin 10 a boleriz.
        int birler = sayi % 10;
        System.out.println("Girdiginiz sayinin birler basamagi:  " + birler);

        int yeniSayi = sayi /= 10;
        System.out.println("yeniSayi:  " + yeniSayi);

        int onlar = sayi % 10;
        System.out.println("girdiginiz sayinin onlar basamagi:  " + onlar);

        int yuzler = sayi /= 10;
        System.out.println("Girdiginiz sayinin yuzler basamagi:  " + yuzler);
    }
}







