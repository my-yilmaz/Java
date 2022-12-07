package lessons.lesson09_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C03_Arrays {
    public static void main(String[] args) {

        //? Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyun
        //?            [2, 3, 12, 0, 0, 0]

        int nums[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[nums.length];

        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                yeni[idx] = nums[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));
    }
}