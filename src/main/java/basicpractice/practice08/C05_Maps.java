package basicpractice.practice08;

import java.util.Arrays;
import java.util.HashMap;

public class C05_Maps {

    //? Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz.
    //* "I like to move it, move it." ==> I=1, like=1, to=1, move=2, it=2

    public static void main(String[] args) {

        String str = "I like to move it, move it.";
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println("str = " + str); //* I like to move it move it

        String[] kelimeler = str.split(" ");

        System.out.println("Arrays.toString(kelimeler) = " + Arrays.toString(kelimeler)); //* [I, like, to, move, it, move, it]

        HashMap<String, Integer> gorunum = new HashMap<>();

        for (String w : kelimeler
        ) {
            Integer gorunumSayisi = gorunum.get(w);
            if (gorunumSayisi == null) {
                gorunum.put(w, 1);
            } else {
                gorunum.put(w, gorunumSayisi + 1);
            }
        }
        System.out.println("gorunum = " + gorunum); //* gorunum = {move=2, like=1, I=1, to=1, it=2}

    }
}
