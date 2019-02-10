package com.gb.datastructures.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Output

 Second largest element present in the array
 Sample Input

 arr = {9,2,3,6}

 Sample Output

 6
 */
public class SecondMaximum {
    public int findSecondMaximum(int[] arr) {
        // Write - Your - Code
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public int findSecondMaximumLinearTime(int[] arr) {
        // Write - Your - Code
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
