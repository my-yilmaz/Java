package javaQuestions.interviewQuestions5;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {
    /*
   TODO:  Ask user to enter an integer.
          If the integer is less than 100, tell user "Won!"
          Otherwise tell user "Lost!"
    */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();
            if (number < 100) {
                System.out.println("Won!");
            }
        } while (number < 100);
        System.out.println("Lost!");
    }
}