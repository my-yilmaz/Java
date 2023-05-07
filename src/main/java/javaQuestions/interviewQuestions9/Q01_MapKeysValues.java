package javaQuestions.interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues {
   /*
   TODO:
    5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    5 tane ulke ismi yazdırıyoruz. (keyset())
    5 tane ulke nufusunu yazdırıyoruz. (values())
    nüfusların toplamını yazdırın.
    kaç tane 50 milyondan fazla nüfuslu ülke var?
    ulke ve nufus  lari hem map gibi.. hem de ayri ayri yazdir?

    */

    public static void main(String[] args) {
       //? 5 tane ülke ismi ve nüfusunu oluştur
        Map<String, Integer> countries = new HashMap<>();
        countries.put("Türkiye", 85000000);
        countries.put("Almanya", 83000000);
        countries.put("Fransa", 67000000);
        countries.put("İngiltere", 66000000);
        countries.put("İtalya", 60000000);

        //? 5 tane ülke ismi ve nüfusunu yazdır
        System.out.println("Ülkeler ve nüfusları:");
        for (Map.Entry<String, Integer> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //? 5 tane ülke ismini yazdır
        System.out.println("\nÜlkeler:");
        for (String country : countries.keySet()) {
            System.out.println(country);
        }

        //? 5 tane ülke nüfusunu yazdır
        System.out.println("\nNüfuslar:");
        for (int population : countries.values()) {
            System.out.println(population);
        }

        //? Nüfusların toplamını hesapla ve yazdır
        int totalPopulation = 0;
        for (int population : countries.values()) {
            totalPopulation += population;
        }
        System.out.println("\nToplam nüfus: " + totalPopulation);

        //? 50 milyondan fazla nüfuslu ülke sayısını hesapla ve yazdır
        int count = 0;
        for (int population : countries.values()) {
            if (population > 50000000) {
                count++;
            }
        }
        System.out.println("\n50 milyondan fazla nüfuslu ülke sayısı: " + count);

        //? Ülke ve nüfuslarını hem ayrı ayrı hem de birlikte yazdır
        System.out.println("\nÜlkeler ve nüfusları (ayrı ayrı):");
        for (String country : countries.keySet()) {
            System.out.println(country);
        }
        for (int population : countries.values()) {
            System.out.println(population);
        }

        System.out.println("\nÜlkeler ve nüfusları (birlikte):");
        for (Map.Entry<String, Integer> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}