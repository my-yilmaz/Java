package advancedpractice.practise01;

import java.util.Scanner;

public class Q02_Substring {
    public static void main(String[] args) {
         /*todo
            Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
            ad ayrı soyad ayrı sekilde ekrana yazdırınız.
            Örn:
            Ad: Ali
            Soyad: Can
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadinizi aralarinda bir bosluk olacak sekilde girin");
        String adSoyad = input.nextLine();

        String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
        System.out.println("ad = " + ad);
        String soyAd = adSoyad.substring(adSoyad.indexOf(" ") + 1);
        System.out.println("soyAd = " + soyAd);
    }
}
