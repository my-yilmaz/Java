package javaQuestions.interviewQuestions5;


public class Q02_PrintEvenNumber {
    /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */

    public static void main(String[] args) {
        int number = 7;
        System.out.println(isEven(number)); // false

        number = 8;
        System.out.println(isEven(number)); // true
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
