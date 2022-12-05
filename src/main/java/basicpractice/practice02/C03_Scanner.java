package basicpractice.practice02;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //? Example 1: Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
        //? ( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )


        Scanner input = new Scanner(System.in);
        System.out.println("yaricapi giriniz");
        double r = input.nextDouble();
        System.out.println("cemberin cevresi: " + 3.14 * 2 * r);
        System.out.println("dairenin alani:  " + 3.14 * r * r);

        //? Example 2: Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

        /**
            A
           A A
          A A A
         */

        System.out.println("Bir karakter giriniz:  ");
        char ch=input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);
    }
}
