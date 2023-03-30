package javaQuestions.interviewQuestions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Q03_FibonacciListNumber {

    //? Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    //* 0-1-1-2-3-5-8-13-21-34....

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayi girin: ");
        int n = scanner.nextInt();

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0); //* İlk eleman 0
        fibonacciList.add(1); //* İkinci eleman 1

        for (int i = 2; i <= n; i++) {
            //* Önceki iki elemanın toplamını alarak yeni elemanı oluştururuz
            int yeniEleman = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(yeniEleman); // Listeye ekleriz
        }

        System.out.println("Fibonacci dizisi: " + fibonacciList);
    }
}