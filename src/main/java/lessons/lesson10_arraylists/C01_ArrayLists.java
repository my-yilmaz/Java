package lessons.lesson10_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayLists {
    //TODO: ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
    //              ******** Array ile ArrayList'ín farki nedir? *******
    // 1) Array olustururken  Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz elelman sayisindan fazlasini koyamayiz.
    //    Array'ler eleman sayisinda "fixed" dirler.
    //    ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirler.
    // 2) Array'lerin icine primitive ve reference"ler koyulabilir
    //    ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
    // 3) Array"ler super fast, cok hizlidir. Array"ler memory'i cok az kullanilir.
    //* Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz.
    //*       Ama eleman sayisi degisken olan coklu datalar icin Array riskini almayin.

    public static void main(String[] args) {
        //? ArrayList nasil olusturulur?
        //* 1. yol;
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //* 2. yol;
        ArrayList<Integer> heights = new ArrayList<>();

        //* 3. yol;
        List<Integer> nums = new ArrayList<>();

        //? ArrayList'ler nasil yazdirirlir?
        System.out.println(nums);  //* []

        //? ArrayList'lere nasil eleman eklenir?
        //* add() her zaman elemani en sona ekler (insertion order)
        nums.add(12);
        nums.add(15);
        nums.add(10);
        System.out.println(nums); //* [12, 15, 10]
        nums.add(1, 25);
        System.out.println(nums); //* [12, 25, 15, 10]
        List<Integer> prices = new ArrayList<>();
        prices.add(44);
        prices.add(176);
        nums.addAll(prices);
        System.out.println(nums); //* [12, 25, 15, 10, 44, 176]
        System.out.println(prices); //* [44, 176]

        nums.addAll(2, prices);
        System.out.println(nums); //* [12, 25, 44, 176, 15, 10, 44, 176]

        //? ArraList'lerin eleman sayisi nasil bulunur? (size())
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi); //* 8

        //? ArrayList'lerde herhangi bir eleman nasil secilir?
        //* get() methodu istenen bir index'teki elemani verir
        int el1 = nums.get(3);
        System.out.println(el1); //* 176

        //? ArraList'in bos olup olmadigini nasil anlariz?
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);  //* false

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);  //* true

        //? ArrayList'lerde  bir eleman nasil degistirilir
        nums.set(2, 55);
        System.out.println(nums); //* [12, 25, 55, 176, 15, 10, 44, 176]

        //? Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz

        for (int w : nums
        ) {
            if (w % 2 != 0) {
                nums.set(nums.indexOf(w), w + 11);
            }
        }
        System.out.println(nums); //* [12, 36, 66, 176, 26, 10, 44, 176]

        //* ===> remove() methodu'nun icine tamsayi koyarsanixz Java onu index olarak kabul eder

        //? Example 2: ArrayList'ten 34 elemaninin ilk gorunumunu siliniz
        //* Note 1: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir yani "int"dir
        //* Note 2: "primitive"ler ArrayList'lerin elemani olamazlar
        //* Note 3: "primitive" i "Wrapper Class" a cevirirseniz, non-primitive olur ve non-primitive'ler ArrayList'lerin elemani olur, index olmaz

        Integer sayi = 36;
        nums.remove(sayi);
        System.out.println(nums); //* [12, 66, 176, 26, 10, 44, 176]
    }
}
