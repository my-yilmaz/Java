package javaQuestions.interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q05_PrintMap {
    /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */

    public static void main(String[] args) {
        // Sayıların sayı ve okunuşlarını ekleme
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "bir");
        numbers.put(2, "iki");
        numbers.put(3, "üç");
        numbers.put(4, "dört");
        numbers.put(5, "beş");
        numbers.put(6, "altı");

        // Verileri yazdırma
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}