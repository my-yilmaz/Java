package myTasks.task04.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("ATM'ye Hoş Geldiniz!");
            System.out.println("1. Para Yatırma");
            System.out.println("2. Para Çekme");
            System.out.println("3. Bakiye Sorgulama");
            System.out.println("4. Çıkış");
            System.out.print("İşlem Seçiniz: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("İyi günler!");
                    break;
                default:
                    System.out.println("Geçersiz bir seçenek girdiniz.");
                    break;
            }

            System.out.println();
        }
    }
}