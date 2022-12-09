package lessons.lesson10_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrayLists {
    public static void main(String[] args) {

        //? Example 3: Bir tane salary(maas) listi olusturun, eger salary 10000'den az ise %20, 10000 ve 10000'den fazla ise %10 zam yapiniz.

        List<Double> salary = new ArrayList<>();

        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary); //*[12345.0, 8674.5, 15000.75, 9500.0, 20500.0]

        for (Double w : salary
        ) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary); //* [13579.500000000002, 10409.4, 16500.825, 11400.0, 22550.000000000004]

        //? Example 4: Iki Array'in esit olup olmadigini kontrol eden kodu yaziniz
        //todo Note: Iki ArrayList'in esit olabilmesi icin elemanlar esit olmali ve ayni elemanlar ayni index'te olmali

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //* 1. yol;
        int counter = 0;
        for (int i = 0; i < m.size(); i++) {

            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler esit degildir.");
                break;
            }
        }

        if (counter == 0) {
            System.out.println("Listler esittir.");
        }


        //* 2. yol;

        boolean esitMi = m.equals(n);

        if (esitMi == true) {
            System.out.println("Listler esittir.");
        } else
            System.out.println("Listler esit degildir.");
    }
}
