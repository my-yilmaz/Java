package lessons.lesson04_ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //** if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar

        //*? Example 1: Kullanici gun numarasini girsin kod gun ismini yazsin
        //*? 2==>Pazartesí   5==>Persembe

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        byte gunNo = scan.nextByte();

        if (gunNo == 1) {
            System.out.println("Pazar");
        } else if (gunNo == 2) {
            System.out.println("Pazartesi");
        } else if (gunNo == 3) {
            System.out.println("Sali");
        } else if (gunNo == 4) {
            System.out.println("Carsamba");
        } else if (gunNo == 5) {
            System.out.println("Persembe");
        } else if (gunNo == 6) {
            System.out.println("Cuma");
        } else if (gunNo == 7) {
            System.out.println("Cumartesí");
        } else {
            System.out.println("Gecerlí bir gunu numarasi giriniz. Gecerli gun numaralari 1,2,3,4,5,6,7 den birisidir");
        }
    }
}