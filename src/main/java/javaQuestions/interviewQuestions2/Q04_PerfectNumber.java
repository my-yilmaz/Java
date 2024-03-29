package javaQuestions.interviewQuestions2;

public class Q04_PerfectNumber {
    /** Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
 */
    public static void main(String[] args) {

        mukemmelSayilariBul(200);

    }

    public static void mukemmelSayilariBul(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            int toplam = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    toplam += j;
                }
            }
            if (toplam == i) {
                System.out.println(i + " mukemmel bir sayidir.");
            }
        }
    }


}
