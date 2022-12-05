package advancedpractice.practise01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {
    public static void main(String[] args) {
        //? Fahrenheit degeri Celsius degere cevirenkod yaziniz
        //? Formul: c=(f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz...");
        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Celsius = " + c);

        NumberFormat numberFormat=new DecimalFormat(".##");
        System.out.println(numberFormat.format(c));
    }
}
