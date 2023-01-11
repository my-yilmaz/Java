package lessons.lesson21_abstraction.abstract01;

public class Dog extends Mammal {

    @Override
    public void eat() {
        System.out.println("Dogs eat");
    }

    @Override
    public void move() {
        System.out.println("Dogs move");
    }
}
