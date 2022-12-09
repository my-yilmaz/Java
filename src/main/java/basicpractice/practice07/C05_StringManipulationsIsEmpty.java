package basicpractice.practice07;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {
    public static void main(String[] args) {
        String srt1 = "Hi";
        System.out.println(srt1.isEmpty());//false
        String srt2 = "";
        System.out.println(srt2.isEmpty());//true
        String srt3 = " ";
        System.out.println(srt3.isEmpty());//false

        //** Kullanicidan alacaginiz bir stringde bosluk karakterinin
        //** olup olmadigini kontrol ediniz.

        String str4 = "kelime";

        if (str4.contains(" ")) {
            System.out.println("boşluk var");
        } else System.out.println("bosluk yok");
    }
}
