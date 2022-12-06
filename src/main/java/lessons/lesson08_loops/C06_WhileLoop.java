package lessons.lesson08_loops;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //? Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

        //* 1. Yol
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //* 2. Yol
        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //? Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int n = 17;
        while (n > 3) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n--;
        }
        System.out.println();

        //? Example 3: 12 den 14 e kadar sayıların toplamını veren kodu yazınız
        int k = 12;
        int sum = 0;

        while (k < 15) {
            sum = sum + k;
            k++;
        }
        System.out.println(sum);

        //? Example-4: Size verilen bir tam sayının rakamlarının toplamını ekrana yazdıran kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Tam sayi giriniz");
        int num = input.nextInt();
        int sonuc = 0;
        while (num > 0) {
            sonuc = sonuc + num % 10;
            num = num / 10;
        }
        System.out.println(sonuc);

        //? Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //?           3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30
        System.out.println("Bir rakam giriniz");
        int s = input.nextInt();
        int z = 1;

        while (z < 11) {
            System.out.println(s + "*" + z + "=" + s * z);
            z++;
        }
    }
}

