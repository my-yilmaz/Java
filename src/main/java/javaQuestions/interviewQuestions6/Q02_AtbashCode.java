package javaQuestions.interviewQuestions6;

import java.util.Scanner;

public class Q02_AtbashCode {
    /*TODO:
 TODO: AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
       Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir metin giriniz: ");
        String metin = scanner.nextLine().toLowerCase();

        StringBuilder sifrelenmisMetin = new StringBuilder();
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            if (karakter >= 'a' && karakter <= 'z') {
                // Harf alfabede ise Atbash koduna gore harf donusumu yapilir
                karakter = (char) ('a' + ('z' - karakter));
            }
            sifrelenmisMetin.append(karakter);
        }

        System.out.println("Sifrelenmis metin: " + sifrelenmisMetin);
    }
}