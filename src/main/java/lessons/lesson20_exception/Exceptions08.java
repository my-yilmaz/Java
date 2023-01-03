package lessons.lesson20_exception;

public class Exceptions08 {
    public static void main(String[] args) {

        double r1 = compareNumOfCharecters("Java", "xy");
        System.out.println(r1);

        double r2 = compareNumOfCharecters(null, "xy");
        System.out.println(r2);

        double r3 = compareNumOfCharecters("Selenium", "");
        System.out.println(r3);
    }

    //? Verilen iki String'den birinin karakter sayisinin digerinin kac kati oldugunu veren method olusturunuz

    public static double compareNumOfCharecters(String s, String t) {
        double result = 0;
        try {
            result = s.length() / t.length();
        } catch (NullPointerException e) {
            System.out.println("length() method'u null ile kullanilamaz");
        } catch (ArithmeticException e) {
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        } finally {
            System.out.println("Database ile connection kesildi");
        }

        return result;
    }
     /*todo
        Interwiev Question ===> "final" , "finally" , "finalize" aciklayiniz???
        1) "final" bir keyword'dur. Variable, Class ve Method'lar icin kullanilir.
           final method override edilemez.
           final variable degeri degistirilemez.
           final class child class sahibi olamaz.
        2) "finally" bir "code block" dur.
           "try-catch" veya sadece "try" ile kullanilir.
           Exception atilsa da atilmasa da calisir.
           "finally" code block icine yazilan code'lar her halukarda calistirilir.
           Mesela Database ile connection'i kesmek her halukarda yapilmasi gereken bir fiildir. Bunu "finally" ile yapabiliriz.
        3) "finalize" bir method'dur. Bu method Java tarafindan data'lar imha edilmeden once cagirilir.
           Bu method data'lari imha edilecek hale getirir ve daha sonra "Garbage Collector" bu data'lari imha eder.
           "finalize" method'unu Java Developer'lar da cagirabilir ama Java kendi bildigini yapar.
     */


}
