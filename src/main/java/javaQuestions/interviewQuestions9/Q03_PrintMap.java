package javaQuestions.interviewQuestions9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q03_PrintMap {
   /*
 TODO:
      aşağıdaki çıktıyı elde ediniz
      Kiraz 100
      İncir 200
      Enginar 150
      Üzüm 145
      Nar 250

    */

    public static void main(String[] args) {
        //Girilen siraya gore almak istersek once blr list olustururuz.
        List<String> meyveler = Arrays.asList("Kiraz", "İncir", "Enginar", "Üzüm", "Nar");
        Map<String, Integer> meyveMiktar = new HashMap<>();
        meyveMiktar.put("Kiraz", 100);
        meyveMiktar.put("İncir", 200);
        meyveMiktar.put("Enginar", 150);
        meyveMiktar.put("Üzüm", 145);
        meyveMiktar.put("Nar", 250);

        for (String meyve : meyveler) {
            System.out.println(meyve + " " + meyveMiktar.get(meyve));
        }
        /*
        Map<String, Integer> meyveNufus = new HashMap<>();
        meyveNufus.put("Kiraz", 100);
        meyveNufus.put("İncir", 200);
        meyveNufus.put("Enginar", 150);
        meyveNufus.put("Üzüm", 145);
        meyveNufus.put("Nar", 250);

        // Verileri yazdırma
        for (Map.Entry<String, Integer> entry : meyveNufus.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
         */
    }
}
