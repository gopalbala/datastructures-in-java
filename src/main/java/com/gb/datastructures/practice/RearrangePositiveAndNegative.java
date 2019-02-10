package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 10/02/19.
 */
public class RearrangePositiveAndNegative {
    public static int[] reArrange(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            if (arr[low] < 0) {
                low++;
            } else {
                int t = arr[high];
                arr[high] = arr[low];
                arr[low] = t;
                high--;
            }
        }
        return arr;
    }
}
