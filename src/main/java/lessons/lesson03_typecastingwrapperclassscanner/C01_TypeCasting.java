package lessons.lesson03_typecastingwrapperclassscanner;

public class C01_TypeCasting {
    //! Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
    // ?           byte < short < int < long < float < double
    //* Kucuk data type'dan buyuk data type'na cevirmeye "Auto Widening" denir. Java kendisi otomatik yapar.
    //* Buyuk data type'dan kucuk data type'na cevirmeye "Explicit Narrowing" denir. Developer kendisi yapar.

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age; //* "Auto Widening": Java byte data type'ni int data type'na otomatik cevirdi.

        long population = 1234;
        int newPopulation = (int) population; //* "Explicit Narrowing": Java data type'ni daraltirken riskli oldugu icin otomatik daraltmaz. Bunu bize birakir.

        //* Example 1: short'u double'a ceviren kodlama
        short numOfStudents = 666;
        double newNumOfStudents = numOfStudents; // Auto Widening
        System.out.println("newNumOfStudents = " + newNumOfStudents); // 666.0

        //* Example 1: float'i byte'a ceviren kodlama

        float price = 112.123F;
        byte newPrice = (byte) price; // Explicit Narrowing
        System.out.println("newPrice = " + newPrice); // 112 ==> Java ondalik sayiyi, tam sayiya cevirirken yuvarlama isleme yapmaz.
                                                      //         Java ondalik sayiyi, tam sayiya cevirirken ondalik basamaklari siler.

        int number = 515;
        byte newNumber = (byte) number;
        System.out.println("newNumber = " + newNumber); //3 //todo  Note: -128, -127, .... 0, 1, .... 126, 128 ==> byte'in sinirlari ve toplam 256 sayi var.
                                                            //todo  Note: Java Explicit Narrowing yaparkan moduler aritmetik yapar ve kalan sayiyi bize verir.
                                                            //todo  Note: 515'de 2 tane 256 var ve kalan da 3'tur.
                                                            //?     Note: İstemedigimiz sonuclar verdigi icin kullanmamaya dikkat edecegiz.

        int num = 510;
        byte newNum = (byte) num;
        System.out.println("newNum = " + newNum); // -2 //todo Note: Java 515'te 1 tane 256 var ve kalan 254 ==> 254 sinirlar dahilinde olmadigi icin, Java 515'i 2' ye boler
                                                        //todo Note: Java 515'i 2 tane 256 var ve kalan -2
                                                        //todo Note: 254 ≡ -2 (mod 256)

    }
}
