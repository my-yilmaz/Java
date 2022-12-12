package lessons.lesson11_passbyvaluemethodoverloading;

public class C01_PassByValue {
    public static void main(String[] args) {
        /**
         1)Java variable'lerin orjinal degerlerini korumak ister.
         2)Variable method'lar icinde kullanildiginda ,Java methodun icine orjinal degeri koymaz,
         o degerin kopyasini uretir ve methoda o kopyayi yollar.
         Method kopya ustune degisiklik yapar dolayisiyla variablenin orjinal degeri korunmus olur
         Bu sisteme "Pass By Value" denir.
         Not:Java "Pass By Value" kullanir."Pass By Reference" kullanmaz.
         Not:Bazi programlama dilleri orjinal degeri koruma altina almamistir.
         bu isi Developerlara birakmistir.Bu tarz diller "Pass By Reference kullanir.
         */

        int x = 5;//* gomlek
        System.out.println(x);//5
        //! static method olan "main method"un icindeki hersey static olmalidir.
        change(x);//* ogrenci gomlegi
        System.out.println(x);//* 5 Gomlek
        int ucret = 100;
        ucret = indirim(ucret);

        System.out.println(ucret);
    }

    public static void change(int a) {
        System.out.println(a * 3);

    }

    //! void disindaki return type'larda method bodysi icinde
    //! "return"keyword kullanilmalidir.
    public static int indirim(int gomlekUcreti) {
        return gomlekUcreti - 10;
    }
}
