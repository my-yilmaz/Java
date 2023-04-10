package javaQuestions.interviewQuestions3;


import java.util.Scanner;

public class Q04_FrequencyOfCertainChar {
    /* TODO:
            Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir isim girin: ");
        String isim = scanner.nextLine();

        System.out.print("Bir karakter girin: ");
        char karakter = scanner.nextLine().charAt(0);

        int tekrarSayisi = 0;
        for (int i = 0; i < isim.length(); i++) {
            if (isim.charAt(i) == karakter) {
                tekrarSayisi++;
            }
        }

        System.out.println("'" + karakter + "' karakteri " + isim + " isminde " + tekrarSayisi + " kez tekrarlanıyor.");
    }
}