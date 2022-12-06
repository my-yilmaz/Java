package basicpractice.practice03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C04_IfStatement {
    //? task: kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
    //? dort islemden biri ile isleme koyup sonucu yazdiriniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen\nToplamaislemi icin 1\nCikarma islemi icin 2\nCarpma islemi icin 3\n" +
                "bolme islemi icin 4\n giriniz");
        int islem = scan.nextInt();
        System.out.println("Lutfen iki tamsayi giriniz.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if (islem == 1) {
            System.out.println("toplama islemi: " + (a + b));
        } else if (islem == 2) {
            System.out.println("cikarma islemi: " + (a - b));
        } else if (islem == 3) {
            System.out.println("carpa islemi: " + (a * b));
        } else if (islem == 4) {
            System.out.println("bolme islemi: " + (a / b));
        } else System.out.println("Hatali giris nyaptiniz.");
    }
}
