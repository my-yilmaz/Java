package javaQuestions.interviewQuestions6;

import java.util.Scanner;

public class Q05_ExponentialNumber {
    /*
   TODO? Get 2 numbers from the user.
         first number base
         second number Top
         Write a code that calculates the prime of a number.
         2, 3 --> 2^3 = 2*2*2= 8
         4, 3 --> 4^3= 4*4*4 = 64
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the top number: ");
        int top = scanner.nextInt();

        int result = (int) Math.pow(base, top);
        System.out.println(base + "^" + top + " = " + result);
    }

}
