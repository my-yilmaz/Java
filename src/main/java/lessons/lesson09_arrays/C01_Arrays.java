package lessons.lesson09_arrays;

import java.util.Arrays;

public class C01_Arrays {
    /**
     ** Ayni data tipinde coklu data'yi depolamak icin java'nin olsuturdugu yapilar vardir.
     ** Bu yapilardan biri de "Array" lerdir.
     */
    public static void main(String[] args) {
        //? Array nasil olusturulur?
        int stdAges[] = new int[7]; //* [0, 0, 0, 0, 0, 0, 0] herhangi data yoksa default deger 0'dir

        //? Array nasil yazdirirlir
        System.out.println(Arrays.toString(stdAges)); //* [0, 0, 0, 0, 0, 0, 0]

        //? Array'lerer nasil eleman eklenir?
        stdAges[0] = 12;
        stdAges[1] = 11;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;

        System.out.println(Arrays.toString(stdAges)); //* [12, 11, 13, 14, 10, 12, 12]

        //? Array'deki herhangi bir elemani nasil yazdirabiliriz
        System.out.println(stdAges[4]); //* 10

        //? Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        Arrays.sort(stdAges);   //* Arrays.sort(); siraya koyma methodu
        System.out.println(Arrays.toString(stdAges));  //* [10, 11, 12, 12, 12, 13, 14]

        int ilk = stdAges[0];

        //todo Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir
        int son = stdAges[stdAges.length - 1];
        System.out.println(ilk + son);  //* 24

        //? Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz
        //** 1. yol;
        int sum = 0;
        for (int i = 0; i < stdAges.length; i++) {
            sum = sum + stdAges[i];
        }
        System.out.println("fori: " + sum); //* 84

        //** 2. yol;
        int i = 0;
        int sum2 = 0;
        while (i < stdAges.length) {
            sum2 = sum2 + stdAges[i];
            i++;
        }
        System.out.println("while: " + sum2); //* 84

        //* 3. yol;
        int k = 0;
        int sum3 = 0;
        do {
            sum3 = sum3 + stdAges[k];
            k++;
        } while (k < stdAges.length);
        System.out.println("do-while: " + sum3); //* 84

        //* 4. yol; for-each loop Array'lerde ve Collections'larda kullanilir.
        int sum4 = 0;
        for (int e : stdAges
        ) {
            sum4 = sum4 + e;
        }
        System.out.println("foreach: " + sum4); //* 84

        //? Example 3; String bir Array olusturunuz Bu Array'e 5 tane isim yerlestiriniz
        //?            Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String myArray[] = new String[5];
        myArray[0] = "Ali";
        myArray[1] = "Tom";
        myArray[2] = "Veli";
        myArray[3] = "Kemal";
        myArray[4] = "Cem";

        int krkTpl = 0;
        for (String w : myArray
        ) {
            krkTpl = krkTpl + w.length();
        }
        System.out.println(krkTpl); //* 18

        //? Example 4 : Char bir Array olusturunuz
        //?            Bu array'e 5 eleman ekleyiniz
        //?            Bu array'deki sadece buyuk harfleri ekrana yazdiriniz

        char ch[] = {'A', 'c', 'D', 'k', 'n'};

        for (char w : ch
        ) {
            if (w >= 'A' && w <= 'Z') {
                System.out.print(w + " ");
            }
        }
    }
}
