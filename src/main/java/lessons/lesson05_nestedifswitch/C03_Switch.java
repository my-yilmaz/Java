package lessons.lesson05_nestedifswitch;

import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {

        // *?  Kullanicidan ay ismini alip verdígi aydan itibaren son aya kadar ekran yazdirin?

        // *  Note: i)  toLowerCase() methodu bir String'deki tum charracter'leri kucuk harfe cevirir.
        // *        ii) toUpperCase() methodu bir String'deki tum charracter'leri buyuk harfe cevirir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ay ismini giriniz");
        String ayIsmi = scan.next().toLowerCase();

        switch (ayIsmi) {
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("Mayis");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylul":
                System.out.println("Eylul");
            case "ekim":
                System.out.println("Ekim");
            case "kasim":
                System.out.println("Kasim");
            case "aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Gecerlí ay ismi giriniz.");
        }
    }
}
