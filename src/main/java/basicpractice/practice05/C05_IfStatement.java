package basicpractice.practice05;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {
        //?Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.

        // * 1.yol: if
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if (a < b) {
            System.out.println("Buyuk olmayan sayi" + a);
        } else if (a > b) {
            System.out.println("Buyuk olmayan sayi" + b);
        } else System.out.println("sayilar birbirine esit");

        //* 2.yol: ternary
        System.out.println(a == b ? "sayilar esit" : a > b ? b : a);
    }
}
