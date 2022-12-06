package basicpractice.practice03;

public class C03_MantikOperatorleri {

    public static void main(String[] args) {

        System.out.println(5 + 2 == 8);//* false
        boolean sonuc = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println("sonuc = " + sonuc);//* true

        boolean sonuc2 = 5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println("sonuc2 = " + sonuc2);//* false

        int sayi1 = 15;

        //? sayi1'in 10 ile 20 araliginda oldugunu true diyerek dondurelim.
        //* Ikili karsilastirmalar yapip Mantiksal Operatorler ile birlestirmeliyiz.
        System.out.println(10 < sayi1 && sayi1 < 20);//* true

        int sayi2 = 5;
        //? sayi2' nin 10 ile 20 arad=sinda olmadigini true diyerek donduren bir kod giriniz.
        System.out.println("sayi2 10 ile 20 arasinda degildir: " + (sayi2 < 10 || sayi2 < 20));
        System.out.println(sayi2 < 10 || sayi2 > 20);//* true

        //TODO: &&==ve  ||==veya
    }
}
