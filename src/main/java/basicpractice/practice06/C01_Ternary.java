package basicpractice.practice06;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /**
        ** TASK :
         ** Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
         ** Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
         ** 3 basamaklı degilse çift olup olmadigini kontrol edin.
         ** Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
         ** Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
         */

        //1.yol:
        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir tamsayi giriniz");
        int sayi = input.nextInt();
        String sonuc = sayi > 0 ? sayi > 99 && sayi < 1000 ? "3 basamakli sayi" :
                sayi % 2 == 0 ? "3 basamakli olmayan cift sayi" : "3 basamakli olmayan sayi" :
                "lutfen pozitif bir sayi giriniz";

        System.out.println(sonuc);
       //2.yol:
        System.out.println("****** if else ******");

        if (sayi > 0) {
            if (sayi < 1000 && sayi > 99) {
                System.out.println("3 basamaklı pozitif sayı");
            } else if (sayi % 2 == 0) {
                System.out.println("3 basamaklı olmayan çift sayı");
            } else System.out.println("3 basamaklı olmayan tek sayı");
        } else System.out.println("Lütfen 0'dan büyük pozitif bir tamsayı giriniz...");
    }
}
