package javaQuestions.interviewQuestions8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q03_CollectionsMethodsTask {
    /*
TODO: part 1: create list of 5 numbers from user input
    sort the list in reverse order and print it
    shuffle the list and print it
    rotate right by 3 places and print it
    //
    bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    listeyi ters sırada sırala ve yazdır
    listeyi karıştır ve yazdır
    3 yer sağa döndür ve yazdır
    //
    part 2: find the max number and min number, print them
    replace all max number with min number
    //
    bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    tüm maksimum sayıları minimum sayı ile değiştir
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        //* kullanıcıdan 5 sayı girişi alıp ve listeye ekleriz
        System.out.println("5 tane sayı girin:");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println("***************************");

        //* listeyi ters sırada sırala ve yazdır
        Collections.reverse(numbers);
        System.out.println("Liste (ters sırada): " + numbers);

        System.out.println("***************************");

        //* listeyi karıştır ve yazdır
        Collections.shuffle(numbers);
        System.out.println("Liste (karışık): " + numbers);

        System.out.println("***************************");

        //* listeyi 3 kez sağa döndür ve yazdır
        Collections.rotate(numbers, 3);
        System.out.println("Liste (3 kez sağa döndürülmüş): " + numbers);

        System.out.println("***************************");

        //* maksimum ve minimum sayıyı bul ve yazdır
        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);
        System.out.println("Maksimum sayı: " + maxNumber);
        System.out.println("Minimum sayı: " + minNumber);

        System.out.println("***************************");

        //* tüm maksimum sayıları minimum sayı ile değiştir ve yazdır
        boolean replaced = Collections.replaceAll(numbers, maxNumber, minNumber);
        if (replaced) {
            System.out.println("Liste (maksimum sayılar minimum sayı ile değiştirilmiş): " + numbers);
        } else {
            System.out.println("Maksimum sayı listede bulunamadı.");
        }
    }
}