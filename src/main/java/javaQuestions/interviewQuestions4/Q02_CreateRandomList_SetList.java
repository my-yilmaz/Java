package javaQuestions.interviewQuestions4;

import java.util.ArrayList;
import java.util.Random;

public class Q02_CreateRandomList_SetList {
    /*
  TODO:  int array list oluşturun 10 elemandan oluşmalı
         random ekle isminde void bir metod oluşturun ve parametresi int array list olsun.
         Bu metod array list içinde 0' dan 20 ye kadar değer atasın.
         Eğer çift sayı atarsa o elemaının yerine 111 yazsın,
         eğer çift sayı yoksa çift sayı yoktur mesajını versin.

     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        randomAdd(list);
        System.out.println(list);
    }

    public static void randomAdd(ArrayList<Integer> list) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(21); // 0-20 arası rastgele sayı üretir
            if (num % 2 == 0) { // çift sayı ise
                list.add(111);
            } else { // tek sayı ise
                list.add(num);
            }
        }

        if (!list.contains(111)) { // eğer çift sayı yoksa
            System.out.println("Çift sayı yoktur.");
        }
    }
}