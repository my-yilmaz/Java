package javaQuestions.interviewQuestions3;

import java.util.Scanner;

public class Q02_Palindrome {

    /*
      Crteate a program checks if a String is PALINDROME or not.
      If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
      For Example : "madam" or "nursesrun" .
      Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
      polindrome :tersten okunuşu da aynı olan ifadeierdir.
      ornek : Ey edip Adanada pide ye,  Traş niçin şart
       */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle veya kelime girin: ");
        String input = scanner.nextLine().toLowerCase();
        if (isPalindrome(input)) {
            System.out.println(input + " palindrome bir cümle/kelime.");
        } else {
            System.out.println(input + " palindrome bir cümle/kelime değil.");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
