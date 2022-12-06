package basicpractice.practice05;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /**
         ** task: Kullanicidan iki sayi isteyin,
         ** sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
         ** sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
         ** sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
         ** sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("sayi1+sayi2=" + (sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println("sayi1*sayi2=" + sayi1 * sayi2);
        } else if (sayi1 * sayi2 < 0) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else
            System.out.println("sifir carpmaya gore yutan elemandir");
    }
}
