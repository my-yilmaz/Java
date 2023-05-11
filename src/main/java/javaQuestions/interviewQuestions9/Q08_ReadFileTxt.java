package javaQuestions.interviewQuestions9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Q08_ReadFileTxt {
       /*
       TODO:
         1)Create a text file inside this package
         2)Type the following text inside the text file
         Java is easy to learn.
         Learn Java, earn money?
         Java is easy if you study well.
         To learn Java, type codes.
         3)Type code to print every word is used how many times in the text.
   */

    public static void main(String[] args) throws IOException {
        // Dosya yolu
        String filePath = "src/main/java/javaQuestions/interviewQuestions9/Q08_FileText.txt";

        // HashMap oluşturma
        HashMap<String, Integer> wordCounts = new HashMap<>();

        try {
            // Dosyayı okuma
            BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));

            // Satır satır okuma
            String line = "";
            while ((line = reader.readLine()) != null) {
                // Her satırı kelimelere ayırma
                String[] words = line.split(" ");

                // Her kelimenin tekrar sayısını hesaplama
                for (String word : words) {
                    if (wordCounts.containsKey(word)) {
                        int count = wordCounts.get(word);
                        wordCounts.put(word, count + 1);
                    } else {
                        wordCounts.put(word, 1);
                    }
                }
            }

            // HashMap'deki her kelime ve tekrar sayısını yazdırma
            for (String word : wordCounts.keySet()) {
                int count = wordCounts.get(word);
                System.out.println(word + ": " + count);
            }

        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}