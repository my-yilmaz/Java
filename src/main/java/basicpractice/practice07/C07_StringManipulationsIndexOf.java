package basicpractice.practice07;

public class C07_StringManipulationsIndexOf {
    public static void main(String[] args) {
        /**
         String str = "Kara kara dusunme Ankara";

         //indexOf() method'u verilen character veya caharacter'lerin "ilk gorunumunun" index'ini verir.

         int idxA1 = str.indexOf("kara");
         System.out.println(idxA1);//5


         //lastIndexOf() method'u verilen character veya caharacter'lerin "son gorunumunun" index'ini verir.

         int idxA2 = str.lastIndexOf("kara");//20 bastan Ankara'nin kara'si
         System.out.println(idxA2);
         */

        //? Ex: Verilen bir String'deki bir character'in tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz

        String str = "Javacancandir";
        char ch = 'j';
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println("tekrarsiz");
        } else
            System.out.println("tekrarli");

        //? Soru 1) Kullanicidan email adresini girmesini isteyin,
        //? mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        //? @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        //? @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırıniz

        String email = "abc@gmail.com";
        String arananMetin = "@gmail.com";
        if (!email.contains(arananMetin)) {
            System.out.println("Lutfen gmail adresinizi giriniz");

        } else if (email.endsWith(arananMetin)) {
            System.out.println("Email adresiniz kaydedildi");

        } else System.out.println("lutfen yazimı kontrol ediniz");

 /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/

        String psw = "12345789.";

        if (psw.length() < 8) {
            System.out.println("Lutfen en az 8 karakterli bir sifre giriniz");
        } else if (psw.contains(" ")) {
            System.out.println("Lutfen space karakteri kullanmayiniz");
        } else if (psw.replaceAll("[^A-Z]", "").length() > 0) {
            System.out.println("Lutfen buyuk harf kullanmayiniz");
        } else if (!psw.endsWith(".")) {
            System.out.println("Lutfen son karakteri '.' olarak giriniz");
        } else
            System.out.println("Tebrikler. Gecerli bir password girdiniz");


//        //2.yol
//        Scanner input = new Scanner(System.in);
//        System.out.println("Sifre olusturunuz");
//        String password = input.next();
//
//        boolean enaz8chvarmi = password.length() > 7;
//        boolean spacevarmi = !password.contains(" ");
//        boolean buyukharfvarmi = password.replaceAll("[^A-Z]", "").length() == 0;
//        boolean sonch = password.endsWith(".");
//
//        if (enaz8chvarmi && spacevarmi && buyukharfvarmi && sonch) {
//            System.out.println("Gecerli bir password girdiniz");
//
//        }else System.out.println("lutfen kurallara uygun giris yapiniz");


//        //3.yol
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your password");
//        String pwd = input.nextLine();
//
//        boolean ch = pwd.length() > 7;
//        boolean space = !pwd.contains(" ");
//        boolean buyuk = pwd.replaceAll("[^A-Z]","").length() == 0;
//        boolean son = pwd.endsWith(".");
//
//        if (ch && space && buyuk && son) {
//            System.out.println("You have succesfully logged in");
//        }else if (!ch) {
//            System.out.println("Password is too short");
//        }else if (!space) {
//            System.out.println("Password cannot contain spaces");
//        }else if (!buyuk) {
//            System.out.println("Password cannot contain uppercase letters");
//        }else if (!son) {
//            System.out.println("Password must contain '.' at the end");
//        }


    }
}
