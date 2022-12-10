package lessons.lesson09_arrays;

import java.util.Arrays;

public class C10_MultiDimensionalArrays {
    public static void main(String[] args) {
        //? Bir multidimansional array'deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz

        int arr[][] = {{2, 5, 1}, {83, 75}};

        int maxElement = arr[0][0];
        int minElement = arr[0][0];
        for (int[] w : arr
        ) {
            for (int k : w
            ) {
                maxElement = Math.max(maxElement, k);
                minElement = Math.min(minElement, k);
            }
        }
        System.out.println("maxElement= " + maxElement + "\nminElement= " + minElement);
        System.out.println(maxElement + minElement);
    }
}
