package lessons.lesson09_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Arrays {
    public static void main(String[] args) {
        //todo: Arrays'lerin icine sadece primitive data tipleri ve referans yollari yerlestirilebilir.

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        System.out.println(Arrays.toString(str));  // [Java, did, surprise you]

        //? Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr
        ) {
            System.out.print(w + " ");
            if (w.equals("Tom")) {
                break;
            }
        }
        System.out.println();

        //? Example 2: String bir Array olusturunuz ve "Tom" ve "Jane" haric tum elemanlari yazdiriniz

        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : brr
        ) {
            if (w.equals("Tom") || w.equals("Jane")) {
                continue;
            }
            System.out.print(w + " ");
        }

        System.out.println();

        //? Example 3: Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz
        //?            Bir ogretmenin sinifindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci gireceksiniz");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];
        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");
        for (int i = 1; i <= numOfStd; i++) {
            System.out.println("Lutfen " + i + ". ogrencinin ilk ismini giriniz.");
            String stdName = input.next();
            if (stdName.equalsIgnoreCase("Q")) {
                break;
            }
            names[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(names));
    }
}