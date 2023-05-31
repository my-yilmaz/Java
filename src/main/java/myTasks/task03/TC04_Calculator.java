package myTasks.task03;

import java.util.Scanner;

public class TC04_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayiyi girin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayiyi girin: ");
        double num2 = scanner.nextDouble();

        System.out.println("İslem secin (+, -, *, /): ");
        String operator = scanner.next();

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Gecersiz islem! İkinci sayi sifir olamaz.");
                    return;
                }
                break;
            default:
                System.out.println("Gecersiz islem secildi.");
                return;
        }

        System.out.println("Sonuc: " + result);
    }
}