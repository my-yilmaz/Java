package javaQuestions.interviewQuestions7;

public class Q05_Printing2DArray {

    // Print 2D String array using loops

    public static void main(String[] args) {
        String[][] arr = {{"a", "b", "c"}, {"d", "e", "f"}};
        print2DArray(arr);
    }

    public static void print2DArray(String[][] arr) {
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
