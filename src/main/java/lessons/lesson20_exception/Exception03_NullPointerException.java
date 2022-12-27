package lessons.lesson20_exception;

public class Exception03_NullPointerException {
    public static void main(String[] args) {
        String str = "Ali";

        getNumOfChars(str);//* 3

        String s = "";
        getNumOfChars(s);//* 0

        String t = null;
        getNumOfChars(t);//*  NullPointerException
        //* eger length() methodunda null kullanirsaniz bu exception'i alirsiniz

    }

    //? Bir  String te bulunan karakterlerin sayisini bulabilmek icin bir method olusturunuz
    public static void getNumOfChars(String str) {

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("length() methodunda bir problem olustu ");
            e.printStackTrace();
            //? bu methodu kullandiginiz zaman System.out.println(); kullanmaniza gerek yok
        }
    }
}
