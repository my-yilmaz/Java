package myTasks.task04;

import java.util.ArrayList;
import java.util.HashSet;

public class T04_TekrarEdenSayilariSilme {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 8, 9, 9, 10};
        int[] tekrarsizDizi = tekrarEdenleriSil(dizi);

        System.out.print("Tekrar edenler silindi: ");
        for (int sayi : tekrarsizDizi) {
            System.out.print(sayi + " ");
        }
    }

    public static int[] tekrarEdenleriSil(int[] dizi) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> tekrarsizListe = new ArrayList<>();

        for (int sayi : dizi) {
            if (!set.contains(sayi)) {
                set.add(sayi);
                tekrarsizListe.add(sayi);
            }
        }

        int[] tekrarsizDizi = new int[tekrarsizListe.size()];
        for (int i = 0; i < tekrarsizListe.size(); i++) {
            tekrarsizDizi[i] = tekrarsizListe.get(i);
        }

        return tekrarsizDizi;
    }
}
