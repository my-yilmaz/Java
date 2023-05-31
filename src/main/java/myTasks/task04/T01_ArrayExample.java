package myTasks.task04;

public class T01_ArrayExample {
    /*
   TODO:  Oluşturdugumuz bir array clası içerisinde 10 adet ögrenci verisi olacak
          Bu ögrencilerin her birinin sene sonu notları olacak ve ögrenci isimlerine kayıtlı olacak
          Soru 1 en yüksek ve en düşük not alan ögrenciyi konsola yazdırınız
          Soru 2  sınıf ortalamasını konsola yazdırınız
          Soru 3 ögrenci 0 ile 44 arası not aldı ise kaldı
          45 ile 69 arası not aldı ise geçer
          70 ile 84 arası not aldı ise iyi
          85 ile 100 arası not aldı ise süper yazdırınız
     */

    public static void main(String[] args) {
        String[] ogrenciIsmi = {"Tom", "Jane", "Julia", "Obama", "Steven", "Mark", "Sam", "Rob", "Brain", "John"};
        int[] ogrenciNotu = {85, 60, 78, 40, 90, 77, 88, 95, 20, 83};

        //? Soru 1 en yüksek ve en düşük ogrenciNotu alan ögrenciyi konsola yazdırınız
        int maxNot = Integer.MIN_VALUE;
        int minNot = Integer.MAX_VALUE;
        String maxNotluOgrenci = "";
        String minNotluOgrenci = "";

        for (int i = 0; i < ogrenciNotu.length; i++) {
            if (ogrenciNotu[i] > maxNot) {
                maxNot = ogrenciNotu[i];
                maxNotluOgrenci = ogrenciIsmi[i];
            }
            if (ogrenciNotu[i] < minNot) {
                minNot = ogrenciNotu[i];
                minNotluOgrenci = ogrenciIsmi[i];
            }
        }

        System.out.println("En yuksek notu alan ogrenciIsmi: " + maxNotluOgrenci + ", Not: " + maxNot);
        System.out.println("En dusuk notu alan ogrenciIsmi: " + minNotluOgrenci + ", Not: " + minNot);

        //? Soru 2  sınıf ortalamasını konsola yazdırınız
        int toplamNot = 0;
        for (int each : ogrenciNotu
        ) {
            toplamNot += each;
        }
        double sinifOrtalamasi = (double) toplamNot / ogrenciNotu.length;
        System.out.println("sinif Ortalamasi = " + sinifOrtalamasi);

        //? Soru 3 ögrencinin durumu
        System.out.println("******* Ogrenci durumlari ********");
        for (int i = 0; i < ogrenciNotu.length; i++) {
            int not = ogrenciNotu[i];
            String statu;
            if (not >= 85) {
                statu = "Super";
            } else if (not >= 70) {
                statu = "Iyi";
            } else if (not >= 45) {
                statu = "Gecer";
            } else {
                statu = "Kaldi";
            }
            System.out.println(ogrenciIsmi[i] + ": " + not + " - " + statu);
        }
    }
}
