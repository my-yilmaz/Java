package myTasks.task03;

import java.util.Scanner;

public class TC01_LeapYear {
    //? Example 1: Verilen yilin "Leap Year" (Artik yil) olup olmadigini kontrol eden kodu yaziniz
    //* i) yil 100'e bolunurse 400'e de bolunur ==> 1600 + 1800 -
    //* ii) yil 100'e bolunmezse 4'e  bolunmelidir ==> 1996 + 2001 -

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir yil giriniz: ");
        int year = input.nextInt();

        //* 1.Yol
        String LeapYear =
                year % 100 == 0 ?
                        (year % 400 == 0 ? "artik yil" : "artik yil degil") :
                        (year % 4 == 0 ? "artik yildir" : "artik yil degildir");
        System.out.println(LeapYear);

        //* 2. Yol
        boolean isLeapYear = year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0));

        String result = isLeapYear ? "artik yildir." : "artik yil degildir.";
        System.out.println(year + " " + result);

        //* 3. Yol Method ile
        boolean isLeapYear1 = isLeapYear(year);
        String result1 = isLeapYear1 ? "artik yildir." : "artik yil degildir.";
        System.out.println(year + " " + result1);

    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0));
    }
}
