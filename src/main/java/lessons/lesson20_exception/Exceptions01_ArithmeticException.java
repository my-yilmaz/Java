package lessons.lesson20_exception;

public class Exceptions01_ArithmeticException {
    /*todo
       1) "Exception" (istisnai hata) javada kodalarimizi calistirirken meydana gelen beklenmedik durumlardir.
       2)  Exceptionlar ile calismanin iki yolu vardir:
          i:try-catch block kullanma ve exception olussa bile calismayi devam ettirme.
          ii:throw exception kullanarak calismayi durdurma.(mesela yazdigimiz kod geregi bir dosya uzerinden okuma
           yapmamiz gerekiyorsa bu dosyamoz eger silinmis ise java dosyayi bulamaz ve uygulamanin devam etmesi gerekmez.
          iii:eger exception i handle etmez isek (sorunu halletmezsek) java calismayi durdurur.
       4) try-catch kullanirken try kodunu bir yada birden fazla catch ile kullanabiliriz.
       5) try catch  olmaksizin yanliz kullanilmaz.
       6) Eger yazmis oldugunuz herhangi bir kod satirinda herhangi bir problem olabilecegini dusunuyorsaniz
         try-catch block icine koymaliyiz.
       7) catch block prantezi icerisinde olmasi muhtemel exception class ismi yazilir.
       8) e.getmessage() , methodunu kullanarak teknik mesajlar elde edebiliriz.
          System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir.
          System.err.println(); hata mesajini renkli olarak verir bu sayede consolda diger mesajlardan
          ayirmak icin kullaniriz.
       9) Eger try body icindeki kod sorunsuz calisirsa catch devreye girmez.
     */

    public static void main(String[] args) {
        divide(6, 2);
        divide(0, 2);
        divide(2, 0); //* ArithmeticException firlatir ==>> bir sayi sifira bolunmez

        divide1(5,0);
    }

    //? 1. Yol: Tavsiye edilmez.
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Sayi sifira bolunemez");
        } else {
            System.out.println(a / b);
        }
    }

    //? 2. Yol: try-catch blogu kullanarak exception'u handle etmek tavsiye edilir.

    public static void divide1(int a, int b) {
      try {
          System.out.println(a / b);
      }catch (ArithmeticException e){
          System.out.println("Bolme isleminde bir problem olustu==>" + e.getMessage());
         // e.printStackTrace();
          System.err.println("Bolme isleminde bir problem olustu==>");
      }
        //* java mnatematik ile ilgili karsilasilmasi muhtemel tum istisnalari ,hatalari
        //* ArithmeticException class'ina koymustur.Matematikteki tum istisnalarin detaylarini bilmek zorunda degiliz.
    }
}
