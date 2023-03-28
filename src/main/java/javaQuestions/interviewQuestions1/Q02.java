package javaQuestions.interviewQuestions1;

import java.util.Scanner;

public class Q02 {
    //? Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar return eden metod yaziniz

    //! ornek:  input            output
    //*         elma  2          eaea
    //*         army  3          ayayay


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        System.out.print("Kaç kez tekrar edilecek?: ");
        int tekrarSayisi = scanner.nextInt();

        String sonuc = ilkVeSonHarfiTekrarla(kelime, tekrarSayisi);
        System.out.println("Sonuç: " + sonuc);
    }

    public static String ilkVeSonHarfiTekrarla(String kelime, int tekrarSayisi) {
        String ilkHarf = kelime.substring(0, 1); //* İlk harf alınır
        String sonHarf = kelime.substring(kelime.length() - 1); //* Son harf alınır

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tekrarSayisi; i++) {
            sb.append(ilkHarf); //* İlk harf tekrar edilir
            sb.append(sonHarf); //* Son harf tekrar edilir
        }

        return sb.toString();
    }
}