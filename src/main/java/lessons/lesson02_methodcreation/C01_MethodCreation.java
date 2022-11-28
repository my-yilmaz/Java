package lessons.lesson02_methodcreation;

public class C01_MethodCreation {
    //** main method icinde kullanacagimiz hersey "static" olmali
    public static void main(String[] args) {
        System.out.println(toplamaYap(1.2, 5));
        System.out.println((ucSayiyiCarp(2, 3, 4)));
    }

    // *? Example 1: Toplama islemi yapana bir methodu olusturma
    public static double toplamaYap(double x, double y) {
        return x + y;
    }

    // *? Example 2: Uc sayiyi birbiri ile carpan bir method olusturma
    public static double ucSayiyiCarp(double x, double y, double z) {
        return x * y * z;
    }

}
