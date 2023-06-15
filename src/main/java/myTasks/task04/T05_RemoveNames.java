package myTasks.task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T05_RemoveNames {
    /* TASK :

 TODO: Input olarak verilen listteki isimlerden
       icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
       *
       INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
       OUTPUT : [Veli,Omer]
     */
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));

        System.out.println("INPUT: " + list1);

        List<String> filteredList = new ArrayList<>();

        for (String name : list1) {
            if (!name.toLowerCase().contains("a")) {
                filteredList.add(name);
            }
        }

        System.out.println("OUTPUT: " + filteredList);
    }
}