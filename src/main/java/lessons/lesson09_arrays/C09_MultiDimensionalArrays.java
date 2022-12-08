package lessons.lesson09_arrays;

import java.util.Arrays;

public class C09_MultiDimensionalArrays {


    //TODO: Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun.
    //      Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each-loop" calismaz cunku index kullanmaz
    //      "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz

    public static void main(String[] args) {
        //? Bir tane integer multidimensional array olusturunuz
        //? Bu array'deki tam sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int sum = 0;

        for (int[] w : arr
        ) {
            for (int k : w
            ) {
                sum = sum + k;
            }
        }
        System.out.println(sum); //* 248

        //? Bir multidimensional array'i normal array'e ceviren kodu yaziniz
        //? { {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}

        int brr[][] = {{2, 5, 1}, {32, 75}};

        int uzunluk = 0;
        for (int[] w : brr
        ) {
            uzunluk = uzunluk + w.length;
        }

        int crr[] = new int[uzunluk];
        int index = 0;
        for (int[] w : brr
        ) {
            for (int k : w
            ) {
                crr[index] = k;
                index++;
            }
        }
        System.out.println(Arrays.toString(crr)); //* [2, 5, 1, 32, 75]
    }
}
