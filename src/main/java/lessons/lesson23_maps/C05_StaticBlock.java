package lessons.lesson23_maps;

public class C05_StaticBlock {

    static {
        System.out.println("Static block 2");
    }

    public static double pi;

    //* static block'lar ihtiyacimiz olan variable'larin class olusturma safhasinda elimizde olmasini saglar.
    //* static block'lar class icindeki herseyden once calistirilir. "main method" dan ve diger tum method'lardan once calistirilir.
    //* static block'lar icinde sadece static variable'lara deger atanabilir.
    //* 1'den fazla static block varsa ustteki once calistirilir.

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        pi = 3.14;
        System.out.println("Static block 1");
    }
}

