package lessons.lesson17_constructor.constructor2;

public class Vehicle {
    public String type;
    public Vehicle(){

    }
    public Vehicle(String type){
        this.type = type;
        System.out.println("Vehicle Constuctor");
    }
}
