package lessons.lesson19_encapsulation_statickeyword;

public class Car {

    public static String make = "Honda";
    public String model = "Accord";
    public int price = 20000;
    public static int counter = 0;

    public Car() {
        counter++;
        price++;
    }
}
