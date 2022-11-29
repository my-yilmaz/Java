package lessons.lesson03_typecastingwrapperclassscanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //? Example 1: Kullanicidan dikdortgenin enini ve boyunu alan ve alan ve cevresini hesaplayan kodu yaziniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdortgenin enini giriniz = ");
        int en = scanner.nextInt();
        System.out.print("Dikdortgenin boyunu giriniz = ");
        int boy = scanner.nextInt();

        int dikdortgeninCevresi = (en + boy) * 2;
        int dikdortgeninAlani = en * boy;
        System.out.println("dikdortgenin Alani = " + dikdortgeninAlani);
        System.out.print("Dikdortgenin Cevresi = " + dikdortgeninCevresi);
    }
}
