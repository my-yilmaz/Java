package basicpractice.practice07;

import java.util.Scanner;

public class C01_StringManipulationConcat {
    /**
     * ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.
     */

    public static void main(String[] args) {


        System.out.println(15 + 20 + "Merhaba");//35Merhaba
        System.out.println("Merhaba" + 15 + 20);//Merhaba 1520
        System.out.println("Merhaba" + (15 + 20));//Merhaba 35
        System.out.println("Merhaba" + 15 * 20);//Merhaba 300

        //?Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
        //?tam isminin buyuk harfle yazilmasini saglayiniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz.");
        String isim = input.nextLine(), soyisim = input.nextLine();
        String tamIsim = isim.concat(" " + soyisim).toUpperCase();
        System.out.println("tamIsim = " + tamIsim);
    }
}
