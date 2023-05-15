package myTasks.task01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class T01_Map {
    /*
 TODO:
     Task: Bir restoranın menüsü ve fiyatları verilmiştir. Müşterilerden sipariş alınırken menüden seçilen yemeklerin fiyatlarının toplamını hesaplamak istiyoruz.
      Örneğin, menüde şu yemekler ve fiyatlar var:
        Hamburger - 20 TL
        Pizza - 25 TL
        Makarna - 18 TL
        Salata - 15 TL
        Kola - 6 TL
        Ayran - 4 TL
      Müşteriler, yemeklerin isimlerini vererek siparişlerini verecekler. Siparişleri alırken, her yemek için fiyatlarını da toplamak istiyoruz.
         Örneğin, müşteri "Hamburger" ve "Kola" siparişi verirse, hesaplamamız 20 + 6 = 26 TL olacak.
     */
    public static void main(String[] args) {
        //? Menü ve fiyatlarını Map'e kaydedelim
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Hamburger", 20);
        menu.put("Pizza", 25);
        menu.put("Makarna", 18);
        menu.put("Salata ", 15);
        menu.put("Kola", 6);
        menu.put("Ayran", 4);

        //? Müşteri siparişlerini alalım
        Scanner scanner = new Scanner(System.in);
        List<String> siparisler = new ArrayList<>();
        while (true) {
            System.out.println("Sipariş vermek için bir yemek adı girin (Çıkmak için 'q' girin):");
            String siparis = scanner.nextLine();
            if (siparis.equals("q")) {
                break;
            }
            siparisler.add(siparis);
        }

        //? Toplam fiyatı hesaplayalım
        int toplamFiyat = 0;
        for (String siparis : siparisler
        ) {
            if (menu.containsKey(siparis)) {
                toplamFiyat += menu.get(siparis);
            } else {
                System.out.println(siparis + " menüde yok.");
            }
        }
        System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
    }
}
