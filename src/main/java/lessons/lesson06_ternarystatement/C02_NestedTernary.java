package lessons.lesson06_ternarystatement;

public class C02_NestedTernary {
    public static void main(String[] args) {
        //? Example 1: Verilen yilin "Leap Year" (Artik yil) olup olmadigini kontrol eden kodu yaziniz
        //* i) yil 100'e bolunurse 400'e de bolunur ==> 1600 + 1800 -
        //* ii) yil 100'e bolunmezse 4'e  bolunmelidir ==> 1996 + 2001 -

        int year = 2022;

        String leap = year % 100 == 0 ? (year % 400 == 0 ? "Leap Year" : "Leap Year degil") : (year % 4 == 0 ? "Leap Year" : "Leap Year degil");
        System.out.println(leap);

        //? Example 1: Asagidaki kurallara gore password'un gecerli olup olmadiigini kontrol eden kodu yaziniz
        //?            i) Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi "i" olmalidir
        //?           ii) Sekiz karakterden az karakter varsa ilk harfi "K" olmalidir

        String pwd = "i2a3de5674";
        char ilkHarf = pwd.charAt(0);
        String sonuc = pwd.length() < 8 ? (ilkHarf == 'K' ? "Gecerli" : "Gecersiz") : (ilkHarf == 'i' ? "Gecerli" : "Gecersiz");
        System.out.println(sonuc);

    }
}
