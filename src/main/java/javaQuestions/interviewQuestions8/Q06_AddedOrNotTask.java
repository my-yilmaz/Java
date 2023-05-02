package javaQuestions.interviewQuestions8;

import java.util.*;

public class Q06_AddedOrNotTask {
/*
TODO: create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
      count how many duplicates we have
      find out what are the duplicated values
      /
     1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
     kaç tane tekrarli eleman olduğunu sayin
     yinelenen değerlerin ne olduğunu öğrenin

 */

    public static void main(String[] args) {
        //* Liste oluştur
        List<Integer> numbers = Arrays.asList(1, 3, 1, 2, 4, 5, 3);

        //* Kaç tane tekrarlı eleman olduğunu say
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : numbers) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        //* Tekrar eden değerleri yazdır
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        //* Sonuçları yazdır
        System.out.println("Tekrar eden eleman sayısı: " + duplicates.size());
        System.out.println("Tekrar eden elemanlar: " + duplicates);
    }
}