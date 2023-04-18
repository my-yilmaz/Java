package javaQuestions.interviewQuestions5;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    //todo: Get String from user and print just vowels(aeiou) inside String on the console

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metin giriniz: ");
        String metin = scanner.nextLine().toLowerCase();

        for (int i = 0; i < metin.length(); i++) {
            char c = metin.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c + " ");
            }
        }
    }
}
