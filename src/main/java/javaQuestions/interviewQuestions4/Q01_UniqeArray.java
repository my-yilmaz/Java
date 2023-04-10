package javaQuestions.interviewQuestions4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_UniqeArray {
    /*
     TODO: Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
           sayilardan olusan bir array haline getiren bir program yaziniz.

         *  INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         *  OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        int[] result = removeDuplicates(input);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        //* İlk elemanı ekle
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        //* Array'deki tüm elemanları tarayarak tekrar edenleri çıkar
        for (int i = 1; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        //* Yeni Array'e elemanları kopyala
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}