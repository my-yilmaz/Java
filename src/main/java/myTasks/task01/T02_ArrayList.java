package myTasks.task01;

import java.util.*;

public class T02_ArrayList {
    /*
    TODO: Bir kullanıcıdan bir dizi sayı alın ve bu sayıları ArrayList'e ekleyin.
          Ardından, ArrayList'teki en büyük ve en küçük sayıları bulun, toplamı hesaplayın ve ortalamayı bulun.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //? Kullanıcıdan sayıları alarak ArrayList'e ekleyelim
        List<Integer> sayilar = new ArrayList<>();
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int adet = scanner.nextInt();
        for (int i = 0; i < adet; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            int sayi = scanner.nextInt();
            sayilar.add(sayi);
        }

        //? En büyük ve en küçük sayı
        int enBuyuk = Collections.max(sayilar);
        int enKucuk = Collections.min(sayilar);

        //? Sayıların toplamını hesaplama
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }

        //? Ortalamayı hesaplama
        double ortalama = (double) toplam / sayilar.size();

        //? Sonuçları ekrana yazdırma
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
        System.out.println("Sayıların toplamı: " + toplam);
        System.out.println("Sayıların ortalaması: " + ortalama);
    }
}