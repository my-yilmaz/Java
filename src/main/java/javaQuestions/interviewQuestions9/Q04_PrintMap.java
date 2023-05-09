package javaQuestions.interviewQuestions9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q04_PrintMap {
    /*
  TODO:
    10, Java
    20, PHP
    2,  Python
    57, C++
    89, C#
    40, Javascript
    Map kullanarak yazınız
     */
    public static void main(String[] args) {
        HashMap<Integer, String> mapL = new LinkedHashMap<>();
        mapL.put(10, "Java");
        mapL.put(20, "PHP");
        mapL.put(2, "Python");
        mapL.put(57, "C++");
        mapL.put(89, "C#");
        mapL.put(40, "Javascript");
        for (Map.Entry<Integer, String> w : mapL.entrySet()
        ) {
            System.out.println(w.getKey() + ", " + w.getValue());
        }
    }
}
