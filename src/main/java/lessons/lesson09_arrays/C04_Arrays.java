package lessons.lesson09_arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        //* binarySearch() Methodu: Bu method'u kullanark bir elemanin Array'de olup olmadigini anlariz
        //*                         binarySearch() Method'unu kullanmadan once mutlaka "Arrays.sort(arr)" KULLANILMALIDIR.
        //*                         binarySearch() Method'u aradigimiz eleman Array'de varsa o elemanin indexini return eder.

        //*                       binarySearch() Method'u aradigimiz eleman Array'de yoksa "-a" seklinde bir negatif bir sayi alirsiniz
        //*                       Bu sayidaki "-" isaretinin anlami olsaydi kacinci sirada olurdu demektir

        //*                       binarySearch() Method'u tekrarlayan elemanlar icin kullanilmaz

        int[] arr = {12, 31, 43, 14};

        int sayi = 43;
        Arrays.sort(arr);//* [12,14, 31, 43]
        System.out.println(Arrays.binarySearch(arr, sayi)); //* 3

        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc);  //* -5

    }
}