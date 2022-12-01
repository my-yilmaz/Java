package lessons.lesson06_ternarystatement;

public class C01_Ternary {
    public static void main(String[] args) {

        //? Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz

        //** 1. Way: if-3lse

        int a = -12;
        if (a > 0) {
            System.out.println("Pozitif");
        } else {
            System.out.println("Pozitif degil");
        }

        //** 2. Way: Ternary
        //todo:       Condition ? true ise uygulanacak kod : false ise uygulanacak kod
        String sonuc = a > 12   ?      "Pozitif"           :      "Pozitif degil";
        System.out.println(sonuc);

        //? Example 2: Iki sayidan kucuk olani secen kod yaziniz
        int b = 25;
        int c = 40;
        int min = b < c ? b : c;
        System.out.println(min);

        //? Example 3: Verilan sayini mutlak degerini hesaplayan kodu yaziniz
        //* Pozitif sayilarin ve sifirin mutlak degerleri kendileridir
        //* Negatif sayilarin mutlak degerleri -1 ile carpilmis halleridir

        int d = -10;
        int abs = d < 0 ? d*-1 : d ;
        System.out.println(abs);

        //? Example 4: Iki tane sayi ayni isaretliyse bu sayilari carpiniz, farkli isaretli ise "Islem yapamam" mesaji veriniz
        int e = 12;
        int f = -10;
        //Todo: Ternary farkli data tiplerinde sonuc return  ederse sonucun data tipini  "Object" yapiniz.
        Object netice = (e>0 && f>0) || (e<0 && f<0) ? e * f : "Islem yapamam";
        System.out.println("netice = " + netice);
    }
}
