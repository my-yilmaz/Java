package javaQuestions.interviewQuestions4;

public class Q06_MultipleMethodVarargs {
    /*
TODO: Problem Tanımı:
      farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
      yazdıran parametreli method yazınız
 */
    public static void main(String[] args) {
        double ort = ortalama(6, 4, 3, 5);
        System.out.println("Notların ortalaması: " + ort);
    }

    public static double ortalama(int... notlar) {
        int toplam = 0;
        for (int not : notlar) {
            toplam += not;
        }
        return (double) toplam / notlar.length;
    }
}