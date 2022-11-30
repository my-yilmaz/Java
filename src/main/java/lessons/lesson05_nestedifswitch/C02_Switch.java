package lessons.lesson05_nestedifswitch;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {

        // *  Kullanicidan gun numarasini alip ekranda gun ismini yazdirin
        // *  2==>Pazartesí   5==>Persembe

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        byte gunNo = scan.nextByte();

        //? 1.yol if ile
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

        //? 2.yol Switch ile
        switch (gunNo) {
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Carsamba");
                break;
            case 5:
                System.out.println("Persemba");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumaetesí");
                break;
            default:
                System.out.println("Gecerlí bir gunu numarasi giriniz.");
        }
    }
}
