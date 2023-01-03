package lessons.lesson20_exception;

import java.io.IOException;

public class Exceptions04_NumberFormatException {
    public static void main(String[] args) {
        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);//* 128


        String str1 = "1a2a";
        int result1 = convertStringToInteger(str1);//* NumberFormatException:Eger icinde rakamdan farkli karakter barindiran bir String'i
                                                   //* ValueOf() kullanarak Integer'a cevirmek isterseniz NumberFormatException alirsiniz.

        System.out.println(result1 + 5);
    }

    public static int convertStringToInteger(String str) {
        int i = 0;
        try {
            //* Herhangi bir satirda "Exception" atilirsa java direkt "catch" bolumune gecer
            //* try icindeki sonraki kodlari calistirmaz.

            i = Integer.valueOf(str);

        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren String'ler Integer'a cevrilemez.");
        }
        return i;
    }
}
