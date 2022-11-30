package lessons.lesson04_ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //** if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //*? Example 1: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Girdiginiz sayi cift");
        } else {
            System.out.println("Girdiginiz sayi tek");
        }

        //*? Example 3: Bir sayinin negatif, veya notr oldugunu soyleyen kodu yaziniz
        System.out.println("Bir sayi giriniz");
        double d = scan.nextDouble();

        if (d > 0) {
            System.out.println("Pozitif");
        } else if (d == 0) {
            System.out.println("Notr");
        } else {
            System.out.println("Negatif");
        }
    }
}