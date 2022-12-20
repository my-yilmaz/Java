package lessons.lesson17_constructor.constructor3;

public class Math extends Courses{

    public void practice(){
        System.out.println("Solve questions");
    }

  public Math(){
      super("x");
      System.out.println("Constructor 1");}


    public Math(int a){
     this();
        System.out.println("Constructor 2");
    }
}
