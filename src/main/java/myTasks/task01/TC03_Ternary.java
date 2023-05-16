package myTasks.task01;

import java.util.Scanner;

public class TC03_Ternary {
    /*
    TODO: Bir kullanıcıdan bir sayı girişi yapmasını isteyin.
          Ardından, kullanıcının girdiği sayının pozitif, negatif veya sıfır
          olduğunu kontrol edin ve sonucu ekrana yazdırın.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı girişi alın
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Sayının pozitif, negatif veya sıfır olduğunu kontrol edin
        String sonuc = (sayi > 0) ? "Pozitif" : (sayi < 0) ? "Negatif" : "Sıfır";

        // Sonucu ekrana yazdırın
        System.out.println("Girdiğiniz sayı: " + sonuc);
    }
}
