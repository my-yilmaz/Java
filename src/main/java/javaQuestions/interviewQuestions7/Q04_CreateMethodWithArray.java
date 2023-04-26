package javaQuestions.interviewQuestions7;

import java.util.Random;

public class Q04_CreateMethodWithArray {
/*
TODO:    ||This Part Should be in Main Method||
         -Create an array of size 5, assign some random values from 0 to 10
         -(use random class and for loop to assign values)


 TODO:   ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
         -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
         -2-Create a method that prints the sum of an array
         -3-Create a method that prints the max element of an array
          .
          P.S: Return type should be void because we are not returning anything just printing

 */
    public static void main(String[] args) {
        // 5 elemanlı bir dizi oluştur ve 0-10 arasında rastgele değerlerle doldur
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }

        // 1. metodu çağırarak diziyi yazdır
        printArray(arr);

        // 2. metodu çağırarak dizinin elemanlarının toplamını yazdır
        int sum = getArraySum(arr);
        System.out.println("Dizinin elemanlarının toplamı: " + sum);

        // 3. metodu çağırarak dizinin en büyük elemanını yazdır
        int max = getMaxArrayElement(arr);
        System.out.println("Dizinin en büyük elemanı: " + max);
    }

    // Dizi elemanlarını aralarında boşluk bırakarak yazdıran metot
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Dizi elemanlarının toplamını hesaplayan ve yazdıran metot
    public static int getArraySum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    // Dizinin en büyük elemanını bulan ve yazdıran metot
    public static int getMaxArrayElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}