package lessons.lesson03_typecastingwrapperclassscanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //? Example 1: Kullanicidan sayilar alip toplama isleme yapan kodu yaziniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz = ");
        double num1 = scanner.nextDouble();
        System.out.print("İkinci sayiyi giriniz = ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.print("Girdiginiz sayilarin toplami = " + sum);
    }
}
