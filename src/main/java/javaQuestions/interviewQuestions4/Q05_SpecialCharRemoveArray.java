package javaQuestions.interviewQuestions4;

import java.util.ArrayList;

public class Q05_SpecialCharRemoveArray {
    /*
   TODO:   Problem Tanımı :
           getSum isminde bir method oluşturun.
           Parametresi ArrayList'tir.
           Dizideki tüm $ ları kaldır ve tüm sayıları topla
           return yaptğımız veri tipi 'int' olmalıdır.
           sonuç 0'dan küçükse, -1 yazdırın.
           .....
           Örnek1:
           ArrayList = $13, $15, $20
           Cevap = 48 olmalı
           ....
           Örnek 2 :
           ArrayList= $-13, $0, $0
           Cevap = -1 olmalı.
    */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("$13");
        list1.add("$15");
        list1.add("$20");

        int result1 = getSum(list1);
        System.out.println("Result 1: " + result1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("$-13");
        list2.add("$0");
        list2.add("$0");

        int result2 = getSum(list2);
        System.out.println("Result 2: " + result2);
    }

    public static int getSum(ArrayList<String> list) {
        int sum = 0;
        for (String w : list) {
            String num = w.replaceAll("\\$", "");
            int n = Integer.parseInt(num);
            sum += n;
        }
        if (sum < 0) {
            return -1;
        }
        return sum;
    }
}