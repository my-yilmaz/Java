package lessons.lesson13_datetime;


import java.time.LocalDate;
import java.time.Month;

public class C04_DateTime {
    public static void main(String[] args) {
        //? Example 8.1: Tom, Ali'den 3 yıl 8 ay 13 gün sonra doğdu. Ali ise Veli'den 1 yıl 15 gün önce doğdu.
        //? Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011, Month.NOVEMBER, 18);
        System.out.println("Tom = " + dobTom); //* 2011-11-18

        LocalDate dobAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);
        System.out.println("Ali = " + dobAli); //* 2008-03-05

        LocalDate dobVeli = dobAli.plusYears(1).plusDays(15);
        System.out.println("Veli = " + dobVeli); //* 2009-03-20
    }
}
