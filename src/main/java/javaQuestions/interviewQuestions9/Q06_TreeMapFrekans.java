package javaQuestions.interviewQuestions9;

import java.util.TreeMap;

public class Q06_TreeMapFrekans {

    // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.

    public static void main(String[] args) {
        System.out.println("countLetters(\"Java is easy\") = " + countLetters("Java is easy"));
    }

    public static TreeMap<Character, Integer> countLetters(String sentence) {
        // Harf sayacını oluştur
        TreeMap<Character, Integer> letterCount = new TreeMap<>();

        // Harfleri say
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }
        }

        return letterCount;
    }
}
