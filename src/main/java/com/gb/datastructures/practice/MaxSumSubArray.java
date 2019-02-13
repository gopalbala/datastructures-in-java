package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 13/02/19.
 */
public class MaxSumSubArray {
    int maxSumSubArray(int[] arr) {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];
            if (maxEndingHere > maxSoFar)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        MaxSumSubArray maxProductSubArray = new MaxSumSubArray();
        int res = maxProductSubArray.maxSumSubArray(arr);
        System.out.println(res);
    }
}
