package lessons.lesson04_ifstatement;

import java.util.Scanner;

public class C04_IfStatement {

    /**
     * *    Note 1: Iki String ifadenin esit olup olmadigini anlamak icin "equals()" kullniriz/
     * *    Note 2: Iki String ifadenin esit olup olmadigini anlamak icin iki tane method kullanilir
     * *          i)  equals() ==> Buyuk harf kucuk harfi onemser
     * *          ii) equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.
     */

    public static void main(String[] args) {
        //** if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //*? Example 1: Kullanici gun ismini aliniz, hafta ici mi hafta sonu mu oldugunu kullaniciya soyleyiniz.
        //*? Pazartesí ==> Hafta Ici   Pazar ==> Hafta Sonu

        // 1. yol
        Scanner scan = new Scanner(System.in);
        System.out.println("Gun ismini giriniz");
        String gunIsmi = scan.nextLine();

//        if (gunIsmi.equalsIgnoreCase("cumartesi")) {
//            System.out.println("Hafta Sonu");
//        } else if (gunIsmi.equalsIgnoreCase("pazar")) {
//            System.out.println("Hafta Sonu");
//        } else if (gunIsmi.equalsIgnoreCase("pazartesi")) {
//            System.out.println("Hafta Ici");
//        } else if (gunIsmi.equalsIgnoreCase("sali")) {
//            System.out.println("Hafta Ici");
//        } else if (gunIsmi.equalsIgnoreCase("carsamba")) {
//            System.out.println("Hafta Ici");
//        } else if (gunIsmi.equalsIgnoreCase("persembe")) {
//            System.out.println("Hafta Ici");
//        } else if (gunIsmi.equalsIgnoreCase("cuma")) {
//            System.out.println("Hafta Ici");
//        } else {
//            System.out.println("Gecerli bir gun adi giriniz...");
//        }
//
//        // 2. yol
//        if (gunIsmi.equalsIgnoreCase("cumartesi") || gunIsmi.equalsIgnoreCase("pazar")) {
//            System.out.println("Hafta Sonu");
//        } else if (gunIsmi.equalsIgnoreCase("pazartesi") ||
//                gunIsmi.equalsIgnoreCase("sali") ||
//                gunIsmi.equalsIgnoreCase("carsamba") ||
//                gunIsmi.equalsIgnoreCase("persembe") ||
//                gunIsmi.equalsIgnoreCase("cuma")) {
//            System.out.println("Hafta Ici");
//        } else {
//            System.out.println("Gecerli bir gun adi giriniz...");
//        }

        // 3. yol
        boolean haftaSonu = gunIsmi.equalsIgnoreCase("cumartesi") || gunIsmi.equalsIgnoreCase("pazar");
        boolean haftaIci = gunIsmi.equalsIgnoreCase("pazartesi") ||
                gunIsmi.equalsIgnoreCase("sali") ||
                gunIsmi.equalsIgnoreCase("carsamba") ||
                gunIsmi.equalsIgnoreCase("persembe") ||
                gunIsmi.equalsIgnoreCase("cuma");
        if (haftaSonu){
            System.out.println("Hafta Sonu");
        } else if (haftaIci) {
            System.out.println("Hafta Ici");
        } else {
            System.out.println("Gecerli bir gun adi giriniz...");
        }
    }
}