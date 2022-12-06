package basicpractice.practice06;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        /**
         Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
         'A'  ->  "Cok Basarili"
         'B'  ->  "Basarili"
         'C'  ->  "Orta"    bu notlar disindakilere de
         Digerleri..
         yazdiriniz.
         Nested Ternary ile cozunuz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen final notunuzu A,B,C seklinde giriniz.");
        String not = input.next();

        String sonuc = (not.equalsIgnoreCase("A")) ? "Cok basarili" :
                (not.equalsIgnoreCase("B")) ? "Basarili" :
                        (not.equalsIgnoreCase("C")) ? "Orta" :
                                "Digerleri.";
        System.out.println("sonuc = " + sonuc);


    }
}
