package lessons.lesson09_arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //? Example 1: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz.
        //?            a-e-i-o-u-A-E-I-O-U

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str = str.toLowerCase();

        String[] letters = str.split("");
        int counter = 0;
        for (String w : letters
        ) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println("sesli harflerin sayisi : " + counter);
    }
}