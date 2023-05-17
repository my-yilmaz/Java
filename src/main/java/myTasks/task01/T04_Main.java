package myTasks.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class T04_Main {

    public static void main(String[] args) {
        // Ürünleri tutacak ArrayList
        ArrayList<T04_Product> productList = new ArrayList<>();

        // Ürünleri eklemek için addProduct metodu kullanılabilir
        addProduct(productList, "Ürün 1", 10.0, 5);
        addProduct(productList, "Ürün 2", 20.0, 3);
        addProduct(productList, "Ürün 3", 15.0, 7);
        addProduct(productList, "Ürün 4", 12.5, 2);
        addProduct(productList, "Ürün 5", 8.5, 4);

        // Ürünleri fiyatlarına göre sıralamak için Collections sınıfını kullanalım
        Collections.sort(productList, Comparator.comparing(T04_Product::getPrice));

        // Ürünleri ekrana yazdıralım
        for (T04_Product p : productList) {
            System.out.println(p);
        }
    }

    // Ürün ekleme metodu
    public static void addProduct(ArrayList<T04_Product> productList, String name, double price, int stock) {
        productList.add(new T04_Product(name, price, stock));
    }
}