package basicpractice.practice04;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Y/N ikilisinden birini giriniz");
        char karakter = input.next().charAt(0);
        if (karakter == 'Y' || karakter == 'y') {
            System.out.println("yes");

        } else if (karakter == 'N' || karakter == 'n') {
            System.out.println("no");

        } else {
            System.out.println("Y veya N harfinden birini giriniz");
        }
    }
}
