package myTasks.task03;

import java.util.Random;
import java.util.Scanner;

public class TC02_DoWhile {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int secretNumber = random.nextInt(100);
        //System.out.println("secretNumber = " + secretNumber);

        do {
            attempts++;
            System.out.print("Bir sayı tahmin edin: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Daha yüksek bir sayı girin.");
            } else if (guess > secretNumber) {
                System.out.println("Daha düşük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Doğru sayıyı " + attempts + ". tahminde buldunuz.");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}
