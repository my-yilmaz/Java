package lessons.lesson20_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    /*todo
          "throw" ile "throws" arasindaki farklar nelerdir?
       1) "throw" method'un body'si icinde kullanilir,
       "throws" ise method'un isminden hemen sonra kullanilir.
       2) "throw" dan sonra obje olusturulur (new keyword'u ile),
       "throws" dan sonra ise sadece Exception Class'in ismi yazilir.
       3) "throw" method'un icinde istedigimiz yerde Exception uretmek icin kullanilir,(exception uretir)
       "throws" ise var olan checked Exception'i (CTE) atmak icin kullanilir. (var olan exception'i atar)
       4) "throw"dan sonra sadece bir tane Exception olabilir,
       "throws"tan sonra ise birden fazla Exception olabilir.
 */
    public static void main(String[] args) {

        readFileLineByLine();

    }

    public static void readFileLineByLine() {

        //* Bir dosyayı satır satır okumak için "readLine() " kullanılır.
        //* readLine() methodu nu kullanabilmek için BufferedReader objesine ihtiyaç duyarız.
        //* BufferReader kullanarak bir text i satir satir yazdiririz.
        //* BufferedReader() constructor i path objesi ile yani (new FileReader(...)) calisir.

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/lessons/lesson20_exception/File.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya karakterler var - " + e.getMessage());
        }
    }
}
