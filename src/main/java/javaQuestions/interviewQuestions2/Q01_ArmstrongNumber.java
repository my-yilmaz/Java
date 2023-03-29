package javaQuestions.interviewQuestions2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    public static void main(String[] args) {
        //? Kullanicidan alinan sayinin Armstrong sayi olup olmadini kontrol eden kodu yaziniz.

        //*  Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi Armstrong sayidir

        //* (0, 1, 153, 370, 371, 407)
        //* 153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }

        //? soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını gösteren program yazınız

        System.out.print("Bir sayi giriniz: ");
        int number1 = scanner.nextInt();
        for (int i = 1; i <= number1; i++) {
            int sum = 0;
            int temp = i;
            int digits = String.valueOf(i).length();
            while (temp != 0) {
                int remainder1 = temp % 10;
                sum += Math.pow(remainder1, digits);
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + ",");
            }
        }
        System.out.print(" bir Armstrong sayisidir.");
    }
}






