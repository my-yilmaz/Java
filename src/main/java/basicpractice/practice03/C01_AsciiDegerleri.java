package basicpractice.practice03;

public class C01_AsciiDegerleri {
    public static void main(String[] args) {

        char harf = 'a';
        char harf2 = 'A';
        System.out.println("harf>harf2==> " + (harf > harf2));

        //* karsilastirma islemlerinin sonucu boolean  true yada false doner.
        //* Herhangi bir char variable'nin ASCII degerlerini kod yazarak buluruz.

        //* 1.YOL;
        char space = ' ';
        System.out.println("Space'in ASCII degeri: " + (space + 0));//32
        char m = 'm';
        System.out.println("m'nin ASCII degeri: " + (m + 0));//109

        //* 2.YOL
        int harf3 = 'm';
        System.out.println("m'nin ASCII degeri: = " + harf3);//109

        //* char'larda Java karaktere int'da atayabiliriz
        //* cunku char'in bir resim karakteri bir de matematiksel ASCII degeri vardir
        //* bu nedenle ASCII degerlerini hesaplayabiliriz.

        int harf4 = 'k';
        System.out.println("k'nin ASCII degeri: = " + harf4);//107

        byte b1 = 12;
        byte b2 = -125;
        System.out.println("b1>b2==>" + (b1 > b2));//true

        float f1 = 2.45645F;
        float f2 = 5.86786F;
        System.out.println("f1>f2==> " + (f1 > f2));//false
        System.out.println("b1>f1==> " + (b1 > f1));//true

        long lng1 = 5456789876L;
        System.out.println("b1<lng1:" + (b1 < lng1));//true

        char ch = 'h';
        System.out.println("b1>ch==> " + (b1 > ch));//false
    }
}
