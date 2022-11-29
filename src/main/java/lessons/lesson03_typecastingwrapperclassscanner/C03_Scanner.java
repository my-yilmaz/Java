package lessons.lesson03_typecastingwrapperclassscanner;

import java.util.Scanner;

public class C03_Scanner {
    //** Scanner kullanicidan data almaya yarar. Scanner kullanici ile etkilesim kurmamizi saglar
    //** Scanner bir Java Class'idir. bu Class'i kullanabilmek icin "import" etmek gerekir.
    //** Scanner Class'i Java'nin util kutuphanesindedir.

    public static void main(String[] args) {

                //! Kullanicidan data almak icin yapilmasi gerekenler

        //? 1.Adim: Scanner Class'indan object olustururuz
        Scanner scan = new Scanner(System.in);

        //? 2.Adim: Kullanicidan data isteriz
        System.out.print("Lutfen yasinizi giriniz = ");

        //? 3.Adim: Kullanicidan aldigimiz data'yi bir variable'in icine koyariz
        byte age = scan.nextByte();

        System.out.print("yasiniz = " + age);

    }
}
