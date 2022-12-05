package lessons.lesson08_loops;

import java.util.Scanner;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        //? Example 1: Asagidaki sekli ekrana yazdiran kodu yazinin
        // ****
        // ****
        // ****

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();
        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();
        System.out.println("karakter seciniz");
        char ch = input.next().charAt(0);


        for (int i = 1; i <= satir; i++) {
            for (int k = 1; k <= sutun; k++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
        /**
         *? Example 2: Asagidaki sekli cizen kodu yaziniz
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /**
         *?  Example 3: Asagidaki sekli cizen kodu yaziniz
         * * * *
         * * *
         * *
         *
         */
        System.out.println();
        int row = 4;

        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
