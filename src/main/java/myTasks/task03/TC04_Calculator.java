package myTasks.task03;

import java.util.Scanner;

public class TC04_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();

        System.out.println("İşlem seçin (+, -, *, /): ");
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
                    System.out.println("Geçersiz işlem! İkinci sayı sıfır olamaz.");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçildi.");
                return;
        }

        System.out.println("Sonuç: " + result);
    }
}