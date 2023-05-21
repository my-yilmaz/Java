package myTasks.task03;

import java.util.Scanner;

public class TC02_dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int secretNumber = 42;

        do {
            System.out.print("Bir sayı tahmin edin: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Daha yüksek bir sayı girin.");
            } else if (guess > secretNumber) {
                System.out.println("Daha düşük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Doğru sayıyı tahmin ettiniz.");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}
