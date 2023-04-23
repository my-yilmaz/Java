package javaQuestions.interviewQuestions7;

import java.util.Locale;
import java.util.Scanner;

public class Q01_UseContinue {
    /*
 TODO: Girilen bir stringin harflerini teker teker ekrana alt alta olacak
       sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine().toLowerCase(Locale.ROOT);
        for (int i = 0; i < metin.length(); i++) {
            char c = metin.charAt(i);
            if (c == 'a' || c == ' ') {
                continue;
            }
            System.out.println(c);
        }
    }
}
