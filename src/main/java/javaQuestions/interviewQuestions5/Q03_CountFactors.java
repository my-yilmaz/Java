package javaQuestions.interviewQuestions5;

import java.util.Scanner;

public class Q03_CountFactors {
    /*
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int factorCount = 0;
        int i = 1;

        while (i <= number) {
            if (number % i == 0) {
                System.out.print(i + ", ");
                factorCount++;
            }
            i++;
        }

        System.out.println("Factors of " + number + " = " + factorCount);
    }
}