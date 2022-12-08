package lessons.lesson09_arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //? Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki
        //? "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.

        int arr[] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr);   // [-12,-5,-2,0,18,23]

        int mxNegative = arr[0];   // ilk eleman kesin negatiftir o yuzden ilk eleman yazilir [] icine
        int minPozitif = arr[arr.length - 1]; // en son eleman kesin pozitiftir o yuzden son eleman yazilir [] icine

        for (int w : arr) {
            if (w < 0) {
                mxNegative = Math.max(mxNegative, w);
            }
            if (w > 0) {
                minPozitif = Math.min(minPozitif, w);
            }
        }
        System.out.println("en buyuk negatif: " + mxNegative + "\nen kucuk pozitif: " + minPozitif); // -2 and 18
    }
}