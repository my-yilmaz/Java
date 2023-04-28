package javaQuestions.interviewQuestions7;

public class Q06_PrintArray {
    // Create a method which takes String array as a parameter
    // and prints all the element

    public static void main(String[] args) {
        String[] myArray = {"Hello", "World", "Java"};
        printStringArray(myArray);
    }
    public static void printStringArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}