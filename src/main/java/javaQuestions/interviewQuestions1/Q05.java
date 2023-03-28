package javaQuestions.interviewQuestions1;

import java.util.Scanner;

public class Q05 {

    //? Kullanicidan bir cumle ve bir harf alin, cumlede harfin kac kere kullanildigini bulup, yazdirin

    //*! ORNEK:
    //* INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
    //* OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cumle giriniz: ");
        String cumle = input.nextLine();

        System.out.print("Harf giriniz: ");
        char harf = input.next().charAt(0);

        int sayac = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.printf("Girdiginiz cumlede \"%c\" harfi %d kere kullanilmis.", harf, sayac);
    }
}