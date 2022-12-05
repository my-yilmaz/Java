package basicpractice.practice01;

public class C01_Variables {

    //* PROJE OLUSTURMA===>File==>New==>Project==>Next==>Name(Buraya projenin ismini yaz kucuk harfle basla javaPractice103104105)==>finish
    //* PACKAGE OLUSTURMA==>java dosyasina sag click==>New==>Package==>istedigin ismi yaz kucuk harfle basla( day01_variables )
    //* CLASS OLUSTURMA==>olusturdugun package uzerine sag click==>New==Class==> istedigin ismi yaz buyuk harfle basla ( C01_Variables )

    /**
     * ? Variable
     * * bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
     * * Variable icinde deger saklayan bir konteynirdir
     * * Bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
     * * Orneğin bir sehrin nufusundan bahsediyorsak variablemızın data türü String,boolean,char veya double alamayız
     * * geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
     */
    public static void main(String[] args) {

        System.out.println("Hello World");

        int level = 1;
        System.out.println("level = " + level);

        boolean sicakMi = false;
        System.out.println("sicakMi = " + sicakMi);

        char sembol = '#';
        System.out.println("sembol = " + sembol);

        double a = 0.2, b = 0.5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        long populationWorld = 70000000000L;
        long sayi = 1234;
        System.out.println("sayi = " + sayi);
        System.out.println("populationWorld = " + populationWorld);

        //? byte ,short,int,long,double,float veri tiplerinin max, min degerlerini yazdiralim.

        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);

        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);

        short shortMax = Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);

        short shortMin = Short.MAX_VALUE;
        System.out.println("shortMin = " + shortMin);

        int intMin = Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);

        int intMax = Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);

        long longMin = Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);

        long longMax = Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);

        double doubleMIn = Double.MIN_VALUE;
        System.out.println("doubleMIn = " + doubleMIn);

        double doubleMax = Double.MAX_VALUE;
        System.out.println("doubleMax = " + doubleMax);
    }
}
