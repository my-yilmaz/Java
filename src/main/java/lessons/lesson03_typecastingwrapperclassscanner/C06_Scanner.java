package lessons.lesson03_typecastingwrapperclassscanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //? Example 1: Kullanicidan adini, ikinci adini, ve soyadini alip asagidaki formatta yaziniz.
        //? Muhammed Etka YILMAZ
        //? 123456789

         // 1. yol
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen ilk isminizi, yaziniz = ");
        String isim = scanner.nextLine();
        System.out.print("Lutfen ikinci isminizi yaziniz = ");
        String ikinciIsim = scanner.nextLine();
        System.out.print("Lutfen soy isminizi yaziniz = ");
        String soyisim = scanner.nextLine();
        System.out.print("Lutfen SSN'inizi yaziniz = ");
        String ssnNo = scanner.nextLine();

        System.out.println(isim + " " + ikinciIsim + " " + soyisim);
        System.out.println(ssnNo);


        // 2. yol
        System.out.println("Lutfen isminizi, ikinci ismininzi, soyadinizi ve SSS numaranizi gíriniz = ");
        String isim1 = scanner.nextLine();
        String ikinciIsim1 = scanner.nextLine();
        String soyisim1 = scanner.nextLine();
        System.out.println("Lutfen SSS numaranizí gíriniz = ");
        String ssnNo1 = scanner.next();

        /**                next() ile nextline() in farki
         *? next() methodu kullanicidan gelen String ifadenin sadece ilk kelimesini alir.
         *? nextline() methodu kullanicidan gelen String ifadenin tamamini alir.
         */

        System.out.println(isim1 + " " + ikinciIsim1 + " " + soyisim1);
        System.out.println(ssnNo1);
    }
}
