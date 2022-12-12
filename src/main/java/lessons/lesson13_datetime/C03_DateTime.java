package lessons.lesson13_datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class C03_DateTime {
    public static void main(String[] args) {
        //? Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz
        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark = ChronoUnit.HOURS.between(germany, japan);
        System.out.println(fark);//* 7

        //? Example 2: Sabit bir tarih olusturunuz
        LocalDate myDate = LocalDate.of(2011, Month.FEBRUARY, 13);
        System.out.println(myDate);//* 2011-02-13

        /**
         Java'da sabit datalari(Gun isimler, Ay isimleri, Amerika'daki eyalet isimleri etc.) depolamak ve gerektiginde kullanmak icin depolar
         olustururuz. Bu depolara "Enum" denir.
         */

        //? Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"
        Countries country = Countries.USA;

        switch (country){
            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");
        }



    }
}
