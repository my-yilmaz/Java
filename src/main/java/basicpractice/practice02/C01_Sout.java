package basicpractice.practice02;

public class C01_Sout {
    /**
     * ? Example 1 :Konsolda asagidaki ciktiyi yazdiriniz
     * <p>
     * T
     * E
     * C
     * H
     * P
     * R
     * O
     * <p>
     * E
     * D
     * U
     * C
     * A
     * T
     * I
     * O
     * N
     */
    //* 1.Yol
    public static void main(String[] args) {

        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println("");  //hiclik ile de calisir
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        //* 2.Yol

        System.out.println("\nT\nE\nC\nP\nP\nR\nO\\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        //? Example 2 : JAVA ILE GUZEL DUNYA  ==>cumlesinin her kelimesini alt alta gelecek sekilde yazdiran bir kod yazin

        System.out.println("\njava\nile\nguzel\ndunya");

        //? Example 3: java ile    guzel  dunya  ==>seklinde kelimeler arasinda bir tab bosluk olacak sekilde yazdiran bir ko

        System.out.println("java\tile\tguzel\tdunya");

        //? Example 4 : java ile guzel dunya  ==>cumlesinin aralarinda bosluk olmayacak sekilde yazdiran bir kod yaziniz.

        System.out.println("java \bile \bguzel \bdunya");

        //! b den once boslu birakmazsan onceki bir harfi siler

        //? Example 5 : Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdıran bir kod yaziniz

        System.out.println("p\na\nz\na\nr\nt\ne\ns\ni");
        //? Example 6 : "Techpro" ile java cok 'kolay'   yazdiran bir kod yaziniz
        System.out.println(" T\"Techpro\"ile java cok \'kolay\'");

        //? Example 7 : "MAHARET" hic 'DUSMEMEK'  degil; "Her dustugunde kalkabilmektir" ==>ifadesini
        //?              "MAHARET" hic 'DUSMEMEK' degil;
        //?                             "Her dustugunde kalkabilmektir" seklinde noktali virgulden sonra
        //?               3 satir asagidan ve satir basi yaparak yazdiran bir kod yaziniz.

        System.out.println("\"MAHARET\" hiç \'DÜŞMEMEK\' değil; \n\n\n\t\"Her düştüğünde kalkabilmektir\"");
    }
}


