package basicpractice.practice08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream myFile = new FileInputStream("src/main/java/basicpractice/practice08/filename.txt");
            Scanner myScanner = new Scanner(myFile);
            String[] myArray = new String[5];
            int i = 0;
            while (myScanner.hasNextLine()) {
                myArray[i] = myScanner.nextLine();
                i++;
            }
            myScanner.close();
            System.out.println("Dosya Okundu!");
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
            e.printStackTrace();
        }
    }
}