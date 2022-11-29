package lessons.lesson02_methodcreation;

public class C03_Car {
    public String marka = "Honda";
    public int fiyat = 20000;
    /*
    *TODO: Note: Class ==> Variable ==> Object ==>Kullanacagiz
                           Method
    */

    public static void main(String[] args) {
                              // ! Object nasil olusturulur?
        // ? 1) ClassIsmi 2) Obje ismi 3) "=" 4) "new" keyword'u 5) ClassIsmi() ==>Constructor
        C03_Car myHonda = new C03_Car();
        myHonda.dur();
        myHonda.hareketEt();
        System.out.println(myHonda.fiyat);  //20000
        System.out.println(myHonda.marka);  //Honda
        C01_MethodCreation methodCreation = new C01_MethodCreation();
        System.out.println(methodCreation.toplamaYap(3, 5)); //8.0
    }

    public void hareketEt() {
        System.out.println("Honda guzel hareket eder...");
    }

    public void dur() {
        System.out.println("Honda guvenli durur");
    }
}
