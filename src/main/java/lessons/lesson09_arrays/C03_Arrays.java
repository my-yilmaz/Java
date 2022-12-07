package lessons.lesson09_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C03_Arrays {
    public static void main(String[] args) {

        //? Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyun
        //?            [2, 3, 12, 0, 0, 0]

        int nums[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[nums.length];

        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                yeni[idx] = nums[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        //? Example 2: Bir Array'in içinde herhangi bir elemanın olup olmadığını kontrol eden
        //?           ve kac kere tekraralandigini gosteren kodu yazınız
        //?          [2,1,2,-3,2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
        //?                       ==> Kullanici 6'yi sordu ==> 6 elemani yok ve 0 kere tekrarlandi

        int arr[] = {2, 1, 2, -3, 2};

        int eleman = 1;
        int counter = 0;
        for (int w : arr
        ) {
            if (w == eleman) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println(eleman + " array'de " + counter + " defa var.");
        } else
            System.out.println(eleman + " array'de yok.");

        //? Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
        //?            "Java kolaydir calisana, ne kolay ki calismayana" ==> calismayana

        String sentence = "Java kolaydir calisana, ne kolay ki calismayana";
        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String words[] = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));  // sort'un iki parametreli kullanimi

        System.out.println(Arrays.toString(words)); // [ne, ki, Java, kolay, kolaydir, calisana, calismayana]


        System.out.println(words[words.length - 1]);  // calismayana
    }
}