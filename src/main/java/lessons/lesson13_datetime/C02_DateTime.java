package lessons.lesson13_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class C02_DateTime {
    public static void main(String[] args) {
        //? Example 1: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz
        LocalDate currenDate = LocalDate.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //* "MM" 10 dan kucuk aylari 01, 02, 03, etc. seklinde yazar
        String formattedDate = dtf.format(currenDate);
        System.out.println(currenDate); //* 2022-12-12
        System.out.println(formattedDate); //* 12/12/2022

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate1 = dtf1.format(currenDate);
        System.out.println(formattedDate1); //* Ara/12/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currenDate);
        System.out.println(formattedDate2); //* Aralık/12/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("M/dd/yyyy"); //* "M" 10 dan kucuk aylari 1, 2, 3, etc. seklinde yazar
        String formattedDate3 = dtf3.format(currenDate);
        System.out.println(formattedDate3); //* 12/12/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate4 = dtf4.format(currenDate);
        System.out.println(formattedDate4); //* 12/12/22

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/d/yy");//* "d" 10 dan kucuk gunlari 1, 2, 3, etc. seklinde yazar, 01, 02, 03 kullanmaz
        String formattedDate5 = dtf5.format(currenDate);
        System.out.println(formattedDate5); //* 12/12/22

        //? Example 2: Java dan aldiginiz time'in formatini degistiriniz
        LocalTime myTime = LocalTime.of(16, 23, 54, 2345);
        System.out.println(myTime); //* 16:23:54.000002345

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("HH:mm"); //* "HH" 24 saat sistemini, "hh" 12 saat sistemini kullanir
        String formattedTime = dtf6.format(myTime);
        System.out.println(formattedTime); //* 16:23

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime1 = dtf7.format(myTime);
        System.out.println(formattedTime1); //* 04:23 ÖS
    }
}
