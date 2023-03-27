package basicpractice.practice08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        try {
            FileInputStream myFile = new FileInputStream("src/main/java/basicpractice/practice08/filename.txt");
            Scanner myScanner = new Scanner(myFile);
            int count = 0;
            while (myScanner.hasNext()) {
                if (myScanner.next().equals("merhaba")) {
                    count++;
                }
            }
            myScanner.close();
            System.out.println("merhaba " + count + " kez bulundu.");
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
            e.printStackTrace();
        }
    }
}
