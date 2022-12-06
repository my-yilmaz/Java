package basicpractice.practice06;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
        // Ex : 568
        // Besyuzaltmissekiz

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen pozitif 3 basamakli bir sayi giriniz.");
        int sayi=input.nextInt();
        int birlerBas=(sayi%10);
        int onlarBas=(sayi/10)%10;
        int yuzlerBas=(sayi/100);

        if (sayi<1000 && sayi>99){
            switch (yuzlerBas){
                case 1:
                    System.out.print("yuz");
                    break;
                case 2:
                    System.out.print("ikiyuz");
                    break;
                case 3:
                    System.out.print("ucyuz");
                    break;
                case 4:
                    System.out.print("dortyuz");
                    break;
                case 5:
                    System.out.print("besyuz");
                    break;
                case 6:
                    System.out.print("altıyuz");
                    break;
                case 7:
                    System.out.print("yedıyuz");
                    break;
                case 8:
                    System.out.print("sekizyuz");
                    break;
                case 9:
                    System.out.print("dokuzyuz");
                    break;
            }
            switch (onlarBas){
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kırk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmıs");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }switch (birlerBas) {
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;
            }}else
                System.out.println("lutfen uc basamakli bir sayi giriniz");
            }
}