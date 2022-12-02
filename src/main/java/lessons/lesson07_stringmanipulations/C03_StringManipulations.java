package lessons.lesson07_stringmanipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {
        //? Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz

        //todo: replace() method'u bir string'deki herhangi bir karakteri veya karakaterleri degistirmek icin kullanilir
        String str = "Ali okula gitti.";
        int num = str.replace(" ", "").length();
        System.out.println(num); //* 14

        //? Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz

        String s = "Ankara'nin tasina gozlerimin yasina bak.";
        String ss = s.replace("a", "A");
        System.out.println(ss); //* AnkArA'nin tAsinA gozlerimin yAsinA bAk.

        //? Example 3: Bir String'deki "kara" kelimelerinin yerine "*" koyunuz

        String t = "Kara kara dusunme Ankara";
        String ts = t.replace("kara", "*");
        System.out.println(ts); //* Kara * dusunme An*

        //? Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //?    AC202117004 ==> AC*********

        String stdtId = "AC202117004";
        String newStdtId = stdtId.replaceAll("[0-9]", "*");
        System.out.println(newStdtId); //* AC*********

        /**
         todo  Bir grup datayi ifade eden kodlara "Regex" denir.
              "Regex" Regular Expressions in kisaltilmis halidir.
            1) Tum rakamlar ==> [0-9]
            2) Tum kucuk harfler ==> [a-z]
            3) Tum buyuk harfler ==> [A-Z]
            4) Tum harfler ==> [a-zA-Z]
            5) Tum sesli harfler ==> [aeiouAEIOU]
            6) Space ==> [ ]
            7) Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
            8) Tum noktalama isaretleri ==> \\p{Punct}

         **  1) Rakamlar haric tum characterler ==> [^0-9]
         **  2) Kucuk harfler haric tum karakterler ==> [^a-z]
         **  3) Buyuk harfler haric tum karakterler ==> [^A-Z]
         **  4) Tum harfler haric tum karakterler ==> [^a-zA-Z]
         **  5) sPACE HARIC TUM KARAKTERLER ==> [^ ]
         **  5) noktalama HARIC TUM KARAKTERLER ==> [^\p{Punct}]
         */

        //? Example 5: Verilen bir String'de kullanilan noktalama isareti ve
        //?            rakamlar ve space karakteri haric tum karakterlerin sayiisni bulan kodu yaziniz


        String u = "Ali 13 yasinda, dersem inanma!...";
        int sonuc = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();

        System.out.println(sonuc); //* 22

        //? Example 6: Bir password'un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //*            i) Space haric en az sekiz karakter olmali
        //*            ii) En az bir sembol icermeli
        //*            iii) En az bir rakam icermeli
        //*            iv)En az 1 buyuk harf icermeli
        //*            v)En az 1 kucuk harf icermeli

        String  pwd= "B78cf? Km";

        //*            i) Space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ","").length()>7;
        //*            ii) En az bir sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z]","").length()>0;
        //*            iii) En az bir rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;
        //*            iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;
        //*            v)En az 1 kucuk harf icermeli
        boolean fífth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean gecerliPwd = first && second && third && fourth && fífth;

        if (gecerliPwd){
            System.out.println("Password'unuz gecerli...");
        } else {
            System.out.println("Password'unuz gecerli degil...");
        }

        //? Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz

        String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";

        int num1 = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(num1);

        //? Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //?            aksi halde "normal" yazdirin.

        String v="Alex";
        boolean start= v.startsWith("Al");
        boolean end = v.endsWith("x");
        String v2 = start && end ? "Harika" : "normal";
        System.out.println(v2);
    }
}
