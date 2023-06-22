package myTasks.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T03_Array {
    /* TASK :
     * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir code create ediniz.
     *
     * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
     * OUTPUT : [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> tekrarsizList = new ArrayList<>();

        for (int num : arr) {
            if (!tekrarsizList.contains(num)) {
                tekrarsizList.add(num);
            }
        }

        Collections.sort(tekrarsizList);
        int[] tekrarsizArray = new int[tekrarsizList.size()];
        int index = 0;

        for (int num : tekrarsizList) {
            tekrarsizArray[index] = num;
            index++;
        }

        System.out.println("OUTPUT: " + Arrays.toString(tekrarsizArray));
    }
}

