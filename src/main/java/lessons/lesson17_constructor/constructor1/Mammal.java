package lessons.lesson17_constructor.constructor1;

public class Mammal extends Animal{

    public int a = 13;

    public int b =34;
    public void eat(){
        System.out.println("Mammal eat");
    }//method
    public void drink(){
        System.out.println("Mammal drink");
    }//method

    public Mammal(){
        System.out.println("Mammal");
    }//constructor

}