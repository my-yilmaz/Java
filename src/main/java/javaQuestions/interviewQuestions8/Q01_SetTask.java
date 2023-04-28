package javaQuestions.interviewQuestions8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q01_SetTask {
/*
TODO: PART 1
     create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
     and add all elements from ArrayList to Set
     /
     ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
     ve tüm öğeleri ArrayList'ten Set'e ekleyin
     /
     PART 2
     create a method that takes Set<Character> and varargs of char as parameters
     and adds all chars to the set
     /
     Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
     ve tüm karakterleri sete ekleyiN
 */

    public static void main(String[] args) {
        //?  PART 1
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Set<Integer> set = new HashSet<>();
        addAll(arrayList, set);
        System.out.println("arrayList elements = " + arrayList);
        System.out.println("set elements = " + set);

        //? PART 2
        char[] chars = {'a', 'b', 'c', 'd', 'e'};

        Set<Character> charSet = new HashSet<>();
        addCharsToSet(charSet, chars);
        System.out.println("charset elements" +charSet);

    }

    public static void addAll(ArrayList<Integer> arrayList, Set<Integer> set) {
        set.addAll(arrayList);
    }
    public static void addCharsToSet(Set<Character> set, char[] chars) {
        for (char c : chars) {
            set.add(c);
        }
    }
}
