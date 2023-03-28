package javaQuestions.interviewQuestions1;

import java.util.*;

public class Q01 {

     //? Kullanicidan bir String aliniz. String'de var olan her character'in sayisini ekrana yazdiriniz.

     //* Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
     //* abaa   ==> a=3  b=1
    public static void main(String[] args) {
        //* Kullanıcıdan bir string ifade alınır
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string ifade giriniz: ");
        String inputString = scanner.nextLine();

        //* Her bir karakterin sayısını tutmak için bir Map oluşturulur
        Map<Character, Integer> charCountMap = new HashMap<>();

        //* String içindeki her bir karakterin sayısı hesaplanır ve charCountMap'e eklenir
        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        //* Her bir karakterin sayısı ekrana yazdırılır
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' karakteri " + entry.getValue() + " kez kullanılmıştır.");
        }
    }
}





