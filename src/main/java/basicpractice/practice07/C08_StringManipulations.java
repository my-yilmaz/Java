package basicpractice.practice07;

import java.util.Scanner;

public class C08_StringManipulations {
    public static void main(String[] args) {
        //? Soru 1) Kullanicidan email adresini girmesini isteyin,
        //?         mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        //?         @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        //?         @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Gmail adresinizi giriniz");
        String email = input.nextLine();
        String aranan = "@gmail.com";

        if (!email.contains(aranan)) {
            System.out.println("lutfen gmail adresi giriniz");

        } else if (email.endsWith(aranan)) {
            System.out.println("Email adresiniz kaydedildi ");
        } else
            System.out.println("lutfen yazimı kontrol edin");

    }
}
