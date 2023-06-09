package myTasks.task04;

import java.util.HashMap;
import java.util.Map;

public class T02_CharCounts {
    public static void main(String[] args) {
        //todo: Bir string ifadesindeki her harfin kac kez kullanildigi bulan kodu yaziniz
        String str = "Merhaba, Java programlama diline hoş geldiniz!";
        Map<Character, Integer> charCounts = new HashMap<>();

        // Her bir harfin sayısını hesapla
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }
        }

        // Sonuçları ekrana yazdır
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}