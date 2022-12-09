package lessons.lesson10_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayLists {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println(names); //* [Tom, Tomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        //! removeAll()
        names.removeAll(cities);   //* removeAll() kullandiginizda sadece ilk List degisir' parantezin icindeki List degismez
        System.out.println(names); //* [Thomas, Tahsin]
        System.out.println(cities);//* [Trump, Tom, Taceddin]


        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames); //** Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder
                                                     //** hepsi varsa true aliriz, en az biri yoksa false
        System.out.println(sonuc1);   //* true

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");


        //? Example 1: "a" listinde "Shoes" elmaninin ilk goronumunu siliniz

        a.remove("Shoes");
        System.out.println(a);  //* [TV, Radio, Laptop, Shoes, Book, Shoes]

        //? Example 2: "a" listinde "Shoes" elmaninin tum goronumlerini siliniz

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);  //* [TV, Radio, Laptop, Book]
    }
}
