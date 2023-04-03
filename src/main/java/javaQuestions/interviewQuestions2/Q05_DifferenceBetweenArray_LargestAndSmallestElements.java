package javaQuestions.interviewQuestions2;

import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {
    /**
     * Create a function that takes an array and the difference between the largest
     * and the smallest numbers. Ask user to enter array elements.
     * Kullanıcının girdigi bir array'in en buyuk elemani ile en kucuk elemanının  farkını bulan bir method olusturunuz
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gireceginiz sayi adeti: "); // Aray'in boyutu
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.printf("%d tane sayi girin:\n", size);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int diff = findDiff(arr);

        System.out.printf("Dizinin en buyuk elemani ile en kucuk elemani arasindaki fark: %d\n", diff);
    }

    public static int findDiff(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }
}