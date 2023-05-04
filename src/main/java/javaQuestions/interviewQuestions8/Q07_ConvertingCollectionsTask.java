package javaQuestions.interviewQuestions8;

import java.util.*;

public class Q07_ConvertingCollectionsTask {
/*
TODO:  create an array of random numbers of size 10
       convert that array into a list
       convert list into set
       ///
       10 boyutunda rasgele sayılardan oluşan bir array oluştur
       bu arrayi bir listeye dönüştür
       listeyi sete çevir

 */
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // 0 ila 99 arasında bir rastgele sayı ekle
        }

        // Arrays'i bir list'e olarak dönüştür
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }

        // List öğelerini bir set olarak dönüştür
        Set<Integer> numberSet = new HashSet<>(numberList);

        // Sonuçları yazdır
        System.out.println("Arrays: " + Arrays.toString(numbers));
        System.out.println("List: " + numberList);
        System.out.println("Set: " + numberSet);
    }
}