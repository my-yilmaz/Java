package lessons.lesson04_ifstatement;

public class C01_IfStatement {
    public static void main(String[] args) {
        //** if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //*? Example 1: Sayi pozitifse ekrana yazdir
        int s = 12;
        if (s > 0) {
            System.out.println("positive");
        }

        //*? Example 2: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdir.

        Character harf = 'V';

        if (harf >= 'A' && harf <= 'Z') {
            System.out.println("Buyuk Harf");
        }
        //todo Note: && islemi sadece boolean ile kullanilir
        //*       true  && true  = true
        //*       true  && false = false
        //*       false && true  = false
        //*       false && false = false
        //todo       && true almak icin karsilastirmanin her iki tarafida true olmali
        //todo       bir tarafi false ise islem false sonucu verir

        //*? Example 3: Verilen sayi uc basamkli ise ekrana "Sayi Uc Basamkli" yazdir.
        int num = -123;
        num = Math.abs(num); //** sayinin mutlak degerini alir

        if (num < 1000 && num > 99) {
            System.out.println("Sayi Uc Basamakli");
        }

        //*? Example 4: Verilen sayi cift sayi ise ekrana "sayi Cift Sayi" yazdir.

        int sayi = 4000;

        if (sayi % 2 == 0) {
            System.out.println("sayi Cift Sayi");
        }
        //todo Note: "=" isareti atama operatorudur, matemetikteki esittir anlamina gelmez.
        //todo Note: "==" isareti Java'da esittir anlamina gelir.

        //*? Example 4: Verilen sayi 300'den kucuk veya 1200'den buyukse ekrana "Muhtesem Sayi" yazdir.
        if (sayi<300 || sayi>1200){
            System.out.println("Muhtesem Sayi");
        }
        //todo Note: "||" veya anlamina gelir, sadece boolean ile kullanilir.
        //*       true  || true  = true
        //*       true  || false = true
        //*       false || true  = true
        //*       false || false = false
        //todo Note: "||" isleminde sartlardan biri true ise sonucu true yapar.
        //todo Note: "||" isleminde false almak icin hepsinin false olmasi gerekir.
    }
}