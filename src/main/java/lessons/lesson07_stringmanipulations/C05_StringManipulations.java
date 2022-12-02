package lessons.lesson07_stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulations {
    public static void main(String[] args) {
        String a= "Java kolaydir.";

        // startsWith("kola",5) kodu ilk 5 karakterden sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        // "kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
        boolean b=a.startsWith("va",2);

        System.out.println(b); //true==>  bu stringin 2. karakterden sonra
        //         ne ile basladigini bulur ve karsilastirir

        System.out.println("Hello world");


    }
}
