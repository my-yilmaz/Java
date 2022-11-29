package lessons.lesson03_typecastingwrapperclassscanner;

public class C02_WrapperClass {
    public static void main(String[] args) {
        /**
        Note: Java Primitive'lere method'lar ekleyerek yeni bir yapi olusturdu,
         bu yapiya  "Wrapper Class" denir
        *TODO: Primitive          Wrapper
               byte      ==>      Byte
               short     ==>      Short
            ** int       ==>      Integer
               long      ==>      Long
               float     ==>      Float
               double    ==>      Double
               boolean   ==>      Boolean
            ** char      ==>      Character
         */

        byte primitiveByte = 12; //* "primitiveByte" yazip nokta koydugumuzda hic method goremeyiz, cunku primitive'ler method icermez sadece deger icerir.

        Byte wrapperByte = 12; //* "wrapperByte" yazip nokta koydugumuzda bir cok method goruruz, cunku "wrapper" lar method icerir.

        //? Example 1: byte data type'nin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

        System.out.println("Byte Max Value = " + Byte.MAX_VALUE); //Byte Max Value = 127
        System.out.println("Byte Min Value = " + Byte.MIN_VALUE); //Byte Min Value = -128

        //? Example 1: short, int, long data type'nin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE); //Short.MIN_VALUE = -32768
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE); //Short.MAX_VALUE = 32767

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE); //Integer.MIN_VALUE = -2147483648
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE); //Integer.MAX_VALUE = 2147483647

        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE); //Long.MIN_VALUE = -9223372036854775808
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE); //Long.MAX_VALUE = 9223372036854775807

        //** "Primitive"ler nasil "Wrapper"lara cevirilir. (Autoboxing)

        float f1 = 13.99F;
        Float wrpperF1 = f1;

        //** "Wrapper"ler nasil "Primitive"lara cevirilir. (Unboxing)

        Character w1 = 's';
        char primitiveW1 = w1;

        //? Note: Autoboxing ve Unboxing java tarafindan otomatik olarak yapilir
    }
}
