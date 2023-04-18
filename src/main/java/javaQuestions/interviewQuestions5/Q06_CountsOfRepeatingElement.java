package javaQuestions.interviewQuestions5;

import java.util.Scanner;

public class Q06_CountsOfRepeatingElement {
    /*
      TODO:   How many times a given number is repeated in a sequence
              Create the Java program that finds it.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Diziyi al
        System.out.print("Enter a sequence of numbers (separated by spaces): ");
        String[] sequence = scanner.nextLine().split(" ");

        // Sayıyı al
        System.out.print("Enter a number to count: ");
        int number = scanner.nextInt();

        // Sayının dizide kaç defa tekrarlandığını say
        int count = 0;
        for (String s : sequence) {
            if (Integer.parseInt(s) == number) {
                count++;
            }
        }

        // Sonucu yazdır
        System.out.println(number + " is repeated " + count + " times in the sequence.");
    }
}