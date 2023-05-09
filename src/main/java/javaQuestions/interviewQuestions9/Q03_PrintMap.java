package javaQuestions.interviewQuestions9;

import java.util.*;

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
        Map<String, Integer> meyveNufus = new LinkedHashMap<>();
        meyveNufus.put("Kiraz", 100);
        meyveNufus.put("İncir", 200);
        meyveNufus.put("Enginar", 150);
        meyveNufus.put("Üzüm", 145);
        meyveNufus.put("Nar", 250);

        // Verileri yazdırma
        for (Map.Entry<String, Integer> entry : meyveNufus.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
