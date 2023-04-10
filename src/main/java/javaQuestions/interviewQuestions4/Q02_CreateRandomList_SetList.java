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
        ArrayList<Integer> list = new ArrayList<>(10); // 10 elemanlı ArrayList oluşturuldu
        randomAdd(list); // randomAdd metoduna list parametresi gönderildi
        System.out.println(list); // listeyi ekrana yazdırdık
    }

    public static void randomAdd(ArrayList<Integer> list) {
        Random rand = new Random();
        boolean ciftSayiMevcut = false; // başlangıçta çift sayı mevcut değil

        for (int i = 0; i < 10; i++) { // 10 elemanlı bir ArrayList olduğu için 10 kere döngüye giriyoruz
            int sayi = rand.nextInt(21); // 0-20 arası bir sayı üretiyoruz

            if (sayi % 2 == 0) { // sayı çift ise
                list.add(111); // listeye 111 ekliyoruz
                ciftSayiMevcut = true; // çift sayı olduğunu belirten değişkeni true yapıyoruz
            } else {
                list.add(sayi); // sayı tek ise direk listeye ekliyoruz
            }
        }

        if (!ciftSayiMevcut) { // çift sayı yoksa
            System.out.println("Çift sayı yoktur."); // mesaj yazdırıyoruz
        }
    }
}