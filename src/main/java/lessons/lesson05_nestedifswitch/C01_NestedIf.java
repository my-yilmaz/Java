package lessons.lesson05_nestedifswitch;

public class C01_NestedIf {
    /**
     ** Password'un ilk harfi buyuk harf ise
              'A' olursa gecerlí password yoksa gecersiz password
     ** Password'un ilk harfi kucuk harf ise
             'z' olursa gecerlí password yoksa gecersiz password

     Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
           Bu yuzden mumkunse "nested" kod yazmamaya calisiriz
     */

    public static void main(String[] args) {

        String pwd = "zxy12!";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z'){
            if (ilkHarf=='A'){
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf=='z'){
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
        }else {
            System.out.println("Ilk karakter harf olmalidir.");
        }
    }
}
