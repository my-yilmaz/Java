package lessons.lesson07_stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        //!                            String Class Methodlari
        /**  **
         **       1) equals(): i) iki tane Strin'gín ayni olup olmadigini anlamamiza yarar
         **                   ii) equals() method'u "boolean" return eder
         **       2)equalIgnoreCase(): i) iki tane Strin'gín ayni olup olmadigini buyuk harf kucuk harf dikkat etmeden anlamamiza yarar
         **                           ii) equalIgnoreCase() method'u "boolean" return eder
         **       3)toLowerCase(): i) Bir  String'deki tum harfleri kucuk harfe cevirmek icin kullanilir
         **                       ii) toLowerCase() method'u "String" return eder //
         **       4)toUpperCase(): i) Bir  String'deki tum harfleri buyuk harfe cevirmek icin kullanilir
         **                       ii) toUpperCase() method'u "String" return eder
         **       5)charAt():     i) Bir  String'den belli karakteri almak icin kullanilir
         **                      ii) toUpperCase() method'u "char" return eder
         **       6)length():     i) Bir  String'de kac tane karakter kullanildigini ogrenmek icin kullanilir
         **                      ii) length() method'u "int" return eder
         **       7)contains():     i) Bir  String'de belli bir karakterin veya karakterlerin var olup olmadigini ogrenmek icin kullanilir
         **                        ii) contains() method'u "boolean" return eder
         **       8)split():      i) Bir  String'i istedigimiz karakterden parcalamaya yarar
         **                      ii) split() method'u "Array" return eder

         */

        /*
        ?    Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz?
                  i) En az sekiz karakter icermeli
                  ii) Space karakteri icermemeli
                  iii) Ilk harfi "M"  veya "m" olmali
                  iv) Son karakteri "?" olmali
         */

        String pwd = "Manisa12?";

        //* i) En az sekiz karakter icermeli
        boolean first = pwd.length() > 7;

        //*ii) Space karakteri icermemeli
        boolean secaond = !pwd.contains(" ");

        //*iii) Ilk harfi "M"  veya "m" olmali
        boolean third = pwd.charAt(0) == 'M' || pwd.charAt(0) == 'm';

        //*iv) Son karakteri "?" olmali
        boolean fourth = pwd.charAt(pwd.length() - 1) == '?';

        System.out.println(first && secaond && third && fourth);
    }
}
