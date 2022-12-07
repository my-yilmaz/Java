package basicpractice.practice07;

public class C04_StringManipulationsStartsWith {
    public static void main(String[] args) {
        /**
         todo startsWith()
              Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         todo endsWith()
              Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String cumle = "Kazananlar hic hata yapmayanlar degil,vazgecmeyenlerdir";
        System.out.println(cumle.startsWith("Ka"));
        System.out.println(cumle.endsWith("dir"));


    }
}
