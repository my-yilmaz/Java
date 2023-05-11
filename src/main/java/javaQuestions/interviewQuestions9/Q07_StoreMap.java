package javaQuestions.interviewQuestions9;

import java.util.HashMap;
import java.util.Scanner;

public class Q07_StoreMap {
    /*
TODO:  1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Bos bir HashMap olusturuyoruz
        HashMap<String, String[]> kisiler = new HashMap<>();
        kisiler.put("4455", new String[]{"Bradd Bitt", "Kansas Ctiy", "2715656"});
        kisiler.put("4456", new String[]{"Angelina Julia", "New York", "2712430"});
        kisiler.put("4457", new String[]{"Tom Hanks", "Arizona", "2712800"});

        // Kullanicidan bilgileri alip ve HashMap'e kaydedilim
        System.out.print("Kimlik numarası: ");
        String kimlikNo = scanner.nextLine();

        System.out.print("Tam adı: ");
        String tamAd = scanner.nextLine();

        System.out.print("Adresi: ");
        String adres = scanner.nextLine();

        System.out.print("Telefonu: ");
        String telefon = scanner.nextLine();

        kisiler.put(kimlikNo, new String[]{tamAd, adres, telefon});
        System.out.println("***********************");
        // Kullanicinin bilgilerini ekrana yazdiriralim
        System.out.print("Bilgilerini görmek istediğiniz kişinin kimlik numarasını girin: ");
        kimlikNo = scanner.nextLine();

        if (kisiler.containsKey(kimlikNo)) {
            String[] bilgiler = kisiler.get(kimlikNo);

            System.out.println("Tam adı: " + bilgiler[0]);
            System.out.println("Adresi: " + bilgiler[1]);
            System.out.println("Telefonu: " + bilgiler[2]);
        } else {
            System.out.println("Bu kimlik numarasına sahip bir kişi bulunamadı.");
        }
        System.out.println("***********************");
        // Tüm kisilerin adlarini ekrana yazdiriralim
        System.out.println("Tüm kişilerin adları:");
        for (String[] bilgiler : kisiler.values()) {
            System.out.println(bilgiler[0]);
        }
    }
}





