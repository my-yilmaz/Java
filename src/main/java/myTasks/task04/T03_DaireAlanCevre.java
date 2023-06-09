package myTasks.task04;

import java.util.Scanner;

public class T03_DaireAlanCevre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();

        // Alan
        double alan = Math.PI * Math.pow(yaricap, 2);
        System.out.println("Dairenin alanı: " + alan);

        // Çevre
        double cevre = 2 * Math.PI * yaricap;
        System.out.println("Dairenin çevresi: " + cevre);

        scanner.close();
    }
}
