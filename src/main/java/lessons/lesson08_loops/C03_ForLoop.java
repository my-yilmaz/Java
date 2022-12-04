package lessons.lesson08_loops;

public class C03_ForLoop {
    public static void main(String[] args) {
        //? Example 1: Bir String'deki "m" karakteri haric tum karakterleri yazdiriniz
        //? Andromeda ==> Androeda
        String str = "Andromeda";
        // 1. yol:
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm') {
                System.out.print(c);
            }
        }
        System.out.println();
        // 2. yol
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue;//Bosveeeer! ==> Loop'un icinde bazi degerler icin Loop'un calismamasini isterseniz "continue" kullaniniz
            }
            System.out.print(c);
        }
        System.out.println();
        //? Example 2: 1 den 100 e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz

        for (int i = 1; i < 101; i++) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        //? Example 3: Size verilen bir String'deki 'm' den onceki karakterleri yazdiriniz
        //?            Luxemburg ==> Luxe  gibi

        String s= "Luxemburg";

        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(0);
        }
    }
}
