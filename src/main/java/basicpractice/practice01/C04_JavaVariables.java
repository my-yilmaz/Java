package basicpractice.practice01;

public class C04_JavaVariables {
    //? Example 1: Farkli 3 data turunde variable olusturun ve bunlari yazdirin.

    public static void main(String[] args) {

        int sayi = 9;
        System.out.println("sayi = " + sayi);

        String ism = "Muhammed";
        System.out.println("isim = " + ism);

        char ch = 'z';
        System.out.println("ch = " + ch);

        //? Example 2: isim ve soyisim icin iki farkli variable olusturun ve bunlari
        //? isminiz:
        //? soyisminiz: seklinde yazdirin.

        String isminiz = "Muhammed";
        System.out.println("isminiz = " + isminiz);
        String soyIsminiz = "YILMAZ";
        System.out.println("soyisminiz = " + soyIsminiz);

        //? Example 3: Iki farkli tamsayi data turunde 2 variable olusturun ,toplamini yazdirin.

        short sayi1 = 4;
        int sayi2 = 8;
        System.out.println("iki farkli data turunun toplami= " + (sayi1 + sayi2));

        //? Example 4: bir tamsayi ve bir ondalikli variable olusturun bunlarin toplamini yazdirin.

        short tamsayi = 12;
        double ondalikli = 3.6;
        System.out.println("tamsayi ile ondalikli sayinin toplami= " + (tamsayi + ondalikli));

        //? Example 5: char data turunde bir variable olusturun ve yazdirin.

        char karakter = '$';
        System.out.println("karakter = " + karakter);

        //? Example 6: bir tamsayi ile bir harfi toplayin.

        int sayi3 = 8;
        char harf = 'A';

        //* 1.yol:
        int toplam = sayi3 + harf;
        System.out.println("toplam = " + toplam);

        //* 2.yol
        System.out.println(sayi3 + harf);

        //* 3.yol
        int sayi4 = 0;
        char harf2 = 's';
        System.out.println(sayi4 + harf2);

        //! Initializing Variable ( Variable baslangic degeri verme)
        int age = 32;
    }
}
