package lessons.lesson03_typecastingwrapperclassscanner;

import java.util.Scanner;

public class C07_Scanner {
    /**
     * * Note: char veriable'lari matemetiksel islemlerle kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
     * Misal: System.out.println(isim + soyisim); ekrana AC yerine 132 yazdirir
     * * Note: Java'da "+" sembolunun iki anlami vardir. i) Toplama islemi ii) Birlestirme islemi (Concatenation)
     * Java "+" sembolunu gorunce once toplama islemi yapmaya calisir, yapamazsa birlestirme isleme yapmaya calsir, o da olmazsa hata verir.
     */
    public static void main(String[] args) {

        //? Example 1: Kullanicidan adini ve soyadini aliniz ve ilk harflerini yazdiriniz.
        //? Muhammed YILMAZ ==>MY

        // 1. yol
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen isminizi, yaziniz = ");
        char isim = scanner.next().charAt(0);
        System.out.print("Lutfen soy isminizi yaziniz = ");
        char soyisim = scanner.next().charAt(0);

        System.out.println(isim + "" + soyisim);

        // 2.yol
        System.out.println("Tam isminizi giriniz...");
        String tamIsim = scanner.nextLine();

        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyiminIlkHarfi = tamIsim.split(" ")[1].charAt(0);

        System.out.println(soyiminIlkHarfi);
    }
}
