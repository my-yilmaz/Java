package lessons.lesson20_exception;

public class Exceptions07_IllegalArgumentException {
    public static void main(String[] args) {

        int age = -25;

        try {
            printAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    //? Yas'i ekrana yazdiran bir method olusturun.

    public static void printAge(int age) {

        if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Yas negatif olamaz veya 200 den buyuk olamaz ");
        }
        System.out.println(age);
    }


}