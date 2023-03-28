package javaQuestions.interviewQuestions1;

import java.util.Scanner;

public class Q04 {
    //? String olan pin kodunu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("PIN kodunuzu girin: ");
        String pin = scanner.nextLine();

        boolean isValidPin = checkPin(pin);

        if (isValidPin) {
            System.out.println("PIN kodu geçerlidir.");
        } else {
            System.out.println("PIN kodu geçersizdir.");
        }
    }

    public static boolean checkPin(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}