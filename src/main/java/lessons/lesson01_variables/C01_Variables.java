package lessons.lesson01_variables;

public class C01_Variables {

    /*
                             How to create Variables?
        1) Access Modifier 2) Data type 3) Variable Name 4) Assignment Operator => =  5) Value 6) ;
    */
    public int age = 13;
    public int height = 129;

    /**                   Java'da Data Type'lari
                   *! Primitive Data Types
     *? 1)int: Integer'in  kisaltmasi olur. Tam sayilari kapsar Memory'de 32 bit kullanir
     En kucuk int:-2,147,483,648
     En buyuk int: 2,147,483,647

     *? 2)byte: Tam sayilar icin kullanilir 8 bit kullanir
     En kucuk int:-128
     En buyuk int: 127

     *? 3)short: Tam sayilar icin kullanilir 16 bit kullanir
     En kucuk int:-32768
     En buyuk int: 32767

     *? 4)long:Tam sayilar icin kullanilir. 64 bit kullanir
     Dgerimiz int buyukse data type olarak long kullaniriz

     *? 5)float: Ondalikli sayilar icindir. 32 bit kullanir
     "float" virgulden sonra 7 basamak icerebilir
     "float" degerlerinden sonra "f" veya "F" koymaniz gerekir

     *? 6)double:Ondalikli sayilar icindir. 64 bit kullanir
     "double" virgulden sonra 16 basamak icerebilir

     *? 7)boolean: true veya false degerleri icin kullanilir.
     Memory'de 1 bit yer kaplar

     *? 8)char: Tek karakaterler icin kullanilir 16 bit kullanilir
          A, c, 2, ?, _, =, ....
   ** Note: "char"lara deger verirken, degeri tek tirnak arasina koyulur, yoksa hata verir.

     ** Note: Numeric Data Types: byte<short<int<long<float<double
     ** Note:  Numeric olmayan Data Types: boolean, char

                *! Non-Primitive Data Types
     *? String: Isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
                String degerleri mutlaka "cift tirnak" arasina konulmalidir.
                String Non-Primitive dir. Yani bir String olusturdugunuzda Java size bir suru method veriyor.

               *! Primitive ile Non-Primitive Data Types Farklari
     ** 1) Non-primitive data type'larinda degerin yaninda method'lar vardir.
     **    Primitive data type'larinda ise sadece deger vardir, method yoktur.
     ** 2) Primitive data type'lari java tarafından olusturulmustur, toplam 8 tanedir. Biz olusturamayiz.
     **    Non-Primitive data type'lari Java tarafindan da olusturulmustur, biz de olusturabiliriz. Non-Primitive  sayilamayacak kadar coktur,
     **    cunku her developer Non-Primitive data type olusturabilir.
     ** 3) Primitive data type isimleri kucuk harfle baslar
     **    Non-Primitive data type isimleri buyuk harfleri baslar
     ** 4) Primitive data type'lari memory'de farkli buyuklukte yer kullanirlar.
     **    Non-Primitive data type'lerin heps memory'de ayni büyüklükte yer kaplarlar.
     */
    public byte price = 12;
    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99F;
    public double weigtOgCell = 0.0000012045;
    // Biz "long" yazmamiza ragmen Java verilen "int" kabul eder
    // Bu yuzden, long bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz
    public long populationOfWorld = 700000000000L;

    // Burada "L" koymadigimiz halde problem yok  cunku "1234" int araligindadir
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name= "Tom Hanks";

    // *! Note: "main method" calismadan hicbirsey calismaz.
    public static void main(String[] args) {

    }

}
