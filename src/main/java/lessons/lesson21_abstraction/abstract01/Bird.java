package lessons.lesson21_abstraction.abstract01;

public class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Birds eat");
    }

    @Override
    public void move() {
        System.out.println("Birds move");
    }

}
