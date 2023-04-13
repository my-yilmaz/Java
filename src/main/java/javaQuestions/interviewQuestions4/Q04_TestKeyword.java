package javaQuestions.interviewQuestions4;

public class Q04_TestKeyword {
    /*
  TODO:   ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
          ogrencilerin cevaplari
          char[][] answers = {
          {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
          {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
          {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
          {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
          {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
          {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
          {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
          {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
          *
          * // cevap anahtari
          char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
          ....
          output:
          1 nolu ogrencinin 7 dogru cevabi var.
          2 nolu ogrencinin 6 dogru cevabi var.
             "           "
             "           "
             "           "
          8 nolu ogrencinin 7 dogru cevabi var.
*/
    public static void main(String[] args) {
        char[][] cevaplar = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        char[] anahtar = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        sinavSonuclari(cevaplar, anahtar);

    }

    public static void sinavSonuclari(char[][] cevaplar, char[] anahtar) {
        for (int i = 0; i < cevaplar.length; i++) {
            int dogruSayisi = 0;
            for (int j = 0; j < cevaplar[i].length; j++) {
                if (cevaplar[i][j] == anahtar[j]) {
                    dogruSayisi++;
                }
            }
            System.out.println((i + 1) + " nolu ogrencinin " + dogruSayisi + " dogru cevabi var.");
        }
    }
}
