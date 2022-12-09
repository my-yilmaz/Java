package lessons.lesson10_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_ArrayLists {
    public static void main(String[] args) {

        //? Example 1: Verilen bir List'teki elemanlari tekrarsiz olarak yaziniz.
        //?            [2,3,2,2,5] ===> [2,3,5]

        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(2);
        arr.add(5);
        System.out.println(arr); //* [2, 3, 2, 2, 5]

        List<Integer> newArr = new ArrayList<>();
        for (int w : arr
        ) {
            if (!newArr.contains(w)) {
                newArr.add(w);
            }
        }
        System.out.println(newArr); //* [2, 3, 5]

        //? Example 2: Kullanicidan bir harf aliniz,
        //?            harf sizdeki List'in icinde varsa o harfi "Bulundu" ya ceviriniz,
        //?            yoksa o harfi List'e ekleyiniz
        //?           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //?           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner input = new Scanner(System.in);
        String harf = "";

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        do {
            System.out.println("Lutfen bir harf giriniz.");
            harf = input.next().substring(0, 1);

            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Bulundu");
            } else if (!harf.equals("Q")) {   // L
                c.add(harf);
            }
            System.out.println(c);
        } while (!harf.equals("Q"));
    }
}
