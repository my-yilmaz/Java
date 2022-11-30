package lessons.lesson05_nestedifswitch;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {

        // *?  Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinesi yapiniz?

        //* Note: Switch de sadece int, byte, short, char, String data tipleri kullanilabilir
        //* Note: Eger 3 den fazla durum carsa switch() kullanmak daha iyi

        Scanner scan = new Scanner(System.in);
        System.out.println("Islemi giriniz: +, -, *, /, %");
        char islem = scan.next().charAt(0);

        System.out.println("Birinci sayiyi giriniz");
        double num1 = scan.nextDouble();
        System.out.println("Ikinci sayiyi giriniz");
        double num2 = scan.nextDouble();

        switch (islem) {
            case '+':
                System.out.println("Girilen iki sayinin toplami = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Girilen iki sayinin farki = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Girilen iki sayinin carpimi = " + (num1 * num2));
                break;
            case '/':
                System.out.println("Girilen iki sayinin bolumu = " + (num1 / num2));
                break;
            case '%':
                System.out.println("Girilen iki sayinin yuzdesi = " + ((num1 * num2) / 100));
                break;
            default:
                System.out.println("Sadece sayi giriniz");
        }
    }
}
