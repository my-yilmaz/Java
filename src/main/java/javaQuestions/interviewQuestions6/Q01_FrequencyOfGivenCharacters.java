package javaQuestions.interviewQuestions6;

import java.util.Arrays;
import java.util.HashMap;

public class Q01_FrequencyOfGivenCharacters {
    /*
   TODO: Interview sorusu...
         Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
         ....
         Test data:
         Input = AAABBCDD
         output = A3B2C1D2
           */

    public static void main(String[] args) {
        String metin = "AAABBCDD bb zzz";
        HashMap<String, Integer> tekrarSayisi = new HashMap<>();
        String[] harfler = metin.toLowerCase().replaceAll(" ", "").split("");
        System.out.println(Arrays.toString(harfler));
        for (String w : harfler
        ) {
            if (tekrarSayisi.containsKey(w)) {
                tekrarSayisi.put(w, tekrarSayisi.get(w) + 1);
            } else {
                tekrarSayisi.put(w, 1);
            }
        }
        System.out.println(tekrarSayisi);
    }
}
