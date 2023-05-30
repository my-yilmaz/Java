package myTasks.task04;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // 5 elemanlı bir int dizisi oluşturuluyor
        int[] numbers = new int[5];

        // Dizinin elemanlarına değer atama
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Dizinin elemanlarını ekrana yazdırma
        System.out.println("Dizinin elemanları: " + Arrays.toString(numbers));

        // Dizinin uzunluğunu ekrana yazdırma
        System.out.println("Dizinin uzunluğu: " + numbers.length);

        // Dizinin belirli bir elemanını değiştirme
        numbers[2] = 35;

        // Dizinin güncellenmiş hali
        System.out.println("Güncellenmiş dizinin elemanları: " + Arrays.toString(numbers));

        // Dizinin elemanlarını toplama
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Dizinin elemanlarının toplamı: " + sum);

        // Dizinin en büyük elemanını bulma
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Dizinin en büyük elemanı: " + max);
    }
}
