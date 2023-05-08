package javaQuestions.interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q02_MapKeySet {
   /*
 TODO:
    create a map of zipcodes and Cities, at least 3 entries
    get the keySet and iterate over it, print the map like below:
    zipcode1 => city1
    zipcode2 => city2
    part 2: print all the keys of the map

    */

    public static void main(String[] args) {
        Map<Integer, String> zipCodeMap = new HashMap<>();
        zipCodeMap.put(34100, "Istanbul");
        zipCodeMap.put(30672, "Ankara");
        zipCodeMap.put(35210, "Izmir");

        for (Integer zipCode : zipCodeMap.keySet()) {
            System.out.println(zipCode + " => " + zipCodeMap.get(zipCode));
        }
        for (Integer zipCode : zipCodeMap.keySet()) {
            System.out.println(zipCode);
        }
    }
}
