package basicpractice.practice01;

public class C02_Variables {
    public static void main(String[] args) {

        short sayi = 124;
        String isim = "Muhammed";
        boolean hizliMi = true;
        System.out.println("hizliMi = " + hizliMi);
        System.out.println("isim = " + isim);
        System.out.println("sayi = " + sayi);

        String isminiz = "Muhammed";
        String soyisminiz = "YILMAZ";
        System.out.println("isminiz = " + isminiz);
        System.out.println("soyisminiz = " + soyisminiz);

        short sayi1 = 34;
        int sayi2 = 45;
        int toplam = sayi1 + sayi2;
        System.out.println("toplam = " + toplam);
        System.out.println("iki farkli data turunun toplami " + (sayi1 + sayi2));

        byte sayi3 = 23;
        double sayi4 = 4.5;
        System.out.println("sayi3 +sayi4 = " + (sayi3 + sayi4));

        char sembol = '$';
        System.out.println("sembol = " + sembol);

        char harf = 'A';
        int deger = 20;
        System.out.println("toplam= " + (harf + deger));

        int top = harf + deger;
        System.out.println("top = " + top);
    }
}
