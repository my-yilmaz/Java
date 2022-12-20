package lessons.lesson17_constructor.constructor2;

public class Honda extends Car {

    public String color;

    public Honda() {
        super("White", 54000);
        System.out.println("Honda constructor");
    }

    public Honda(String color) {
        this.color = color;
    }
}