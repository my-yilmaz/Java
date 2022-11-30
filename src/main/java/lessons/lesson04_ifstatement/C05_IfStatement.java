package lessons.lesson04_ifstatement;

import java.util.Scanner;

public class C05_IfStatement {

    /**
     * * Kullanicidan yas degerini alan ve yasin hangi evrede  oldugunu taploya gore yazdiriniz.
     * * 0-4 ==> bebek
     * * 5-12 ==> cocuk
     * * 13-20 ==> genc
     * * 21-30 ==> yetiskin
     * * tanimlanmamis evre
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        byte yas = scan.nextByte();

        if (yas < 0) {
            System.out.println("Gecerli yas giriniz");
        } else if (yas < 5) {
            System.out.println("Bebek");
        } else if (yas < 13) {
            System.out.println("Cocuk");
        } else if (yas < 21) {
            System.out.println("Genc");
        } else if (yas < 31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis evre");
        }
    }
}