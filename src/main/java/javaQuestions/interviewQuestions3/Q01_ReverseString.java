package javaQuestions.interviewQuestions3;

import java.util.Scanner;

public class Q01_ReverseString {
    /**
     *? Stringi ters cevirmek icin bir Java Programi yazin
      1.Yol: StringBuilder () kullanarak
      2.Yol: String Classini kullanarak
      3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
     */

    public static void main(String[] args) {

        //? 1.Yol: StringBuilder () kullanarak

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cumle giriniz: ");
        String cumle = scanner.nextLine();

        StringBuilder sb = new StringBuilder(cumle);
        sb.reverse();
        String tersCumle = sb.toString();
        System.out.println("StringBuilder ile tersine cevirilmis cumle: " + tersCumle);

        //? 2.Yol: String Classini kullanarak

        StringBuilder tersCumle1 = new StringBuilder();

        for (int i = cumle.length() - 1; i >= 0; i--) {
            tersCumle1.append(cumle.charAt(i));
        }
        System.out.println("String Class ile tersine cevirilmis cumle: " + tersCumle1);

        //? 3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin

        String tersCumle3 = tersCevir(cumle);

        System.out.println("Method ile tersine çevrilmiş cumle: " + tersCumle3);

    }
    public static String tersCevir(String cumle) {
        StringBuilder sb = new StringBuilder(cumle);
        sb.reverse();
        return sb.toString();
    }
}
