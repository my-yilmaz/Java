package javaQuestions.interviewQuestions6;


import java.util.ArrayList;
import java.util.List;

public class Q06_DuplicateValue {
       /*
   TODO: Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        char[] charArray = str.toCharArray(); // String'i liste dönüştüruyoruz

        ArrayList<Character> duplicates = new ArrayList<>(); // Tekrar eden karakterleri saklamak için bir ArrayList oluşturuyoruz

        // Her bir karakteri kontrol etmek için bir döngü kullaniyoruz
        for (int i = 0; i < charArray.length; i++) {
            int count = 1; // Harf sayacını 1 olarak ayarliyoruz
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++; // Harf sayacını arttır
                }
            }
            if (count > 1 && !duplicates.contains(charArray[i])) {
                duplicates.add(charArray[i]); // Tekrar eden karakterleri ArrayList'e ekle
            }
        }

        System.out.println("Duplicate characters in the String: " + duplicates);
    }
}