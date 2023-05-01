package javaQuestions.interviewQuestions8;

public class Q05_WrapperClassTask {
/*
 TODO:  create a method that accepts an int
        and returns twice of that int
        overload this method with wrapper class: Integer
        /
        int kabul eden bir metot yarat
        ve bu int'nin iki katını döndürür
        bu yöntemi wrapper sınıfıyla overload et : Integer

 */

    public static void main(String[] args) {
        int x = 5;
        System.out.println("2 katı: " + doubleInt(x));

        Integer y = 10;
        System.out.println("2 katı: " + doubleInt(y));
    }

    public static int doubleInt(int num) {
        return num * 2;
    }

    public static Integer doubleInt(Integer num) {
        return num * 2;
    }
}
