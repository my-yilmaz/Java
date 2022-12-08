package lessons.lesson09_arrays;

import java.util.Arrays;

public class C08_MultiDimensionalArrays {
    public static void main(String[] args) {
        //? MultiDimensionalArray kisa yoldan nasil olusturulur?

        char[][] arr = {{'a', 'b'}, {'C', 'D', 'E'}, {'?'}};

        System.out.println(Arrays.deepToString(arr)); //* [[a, b], [C, D, E], [?]]

        //? bir String MultiDimensionalArray'de icinde "a" olan elemanlari concole'a yazdiriniz.
        String[][] brr = {{"learn", "java", "it"}, {"is", "easy"}};
        for (String[] w : brr
        ) {
            for (String k : w
            ) {
                if (k.contains("a")) {
                    System.out.print(k + " ");
                }
            }
        }
    }
}
