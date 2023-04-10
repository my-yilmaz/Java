package javaQuestions.interviewQuestions3;

import java.util.ArrayList;

public class Q05_ArrayListTask {
    /*
  TODO:     Part1:
            Create an arraylist of Strings
            add - "Red", "Green", "Blue", "Yellow" and "Black" inside
            print out all the elements, each element on new line

  TODO:     Part2:
            Create a method that accepts a String arraylist and a String as parameters
            method should add the element at the first index of arraylist

  TODO:     Part3:
            Create a method that accepts a String arraylist and a String as parameters
            it should add element before last element
            ex:  [1, 2, 3]  -> [1, 2, 4, 3]

     */

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        for (String w : colors
        ) {
            System.out.println(w);
        }

        ArrayList<String> sayilar = new ArrayList<>();
        sayilar.add("1");
        sayilar.add("2");
        sayilar.add("3");
        System.out.println(sayilar); // [1, 2, 3]

        sonOncesiEkle(sayilar, "4");
        System.out.println(sayilar); // [1, 2, 4, 3]

    }

    public static void ilkIndekseEkle(ArrayList<String> liste, String eleman) {
        liste.add(0, eleman);
    }

    public static void sonOncesiEkle(ArrayList<String> liste, String eleman) {
        int sonIndeks = liste.size() - 1;
        liste.add(sonIndeks, eleman);
    }
}
