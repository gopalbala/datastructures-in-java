package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 13/02/19.
 */
public class MaxProducrSubArray {
    int maxProductSubArray(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 1;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere *= arr[i];
            if (maxEndingHere > maxSoFar)
                maxSoFar = maxEndingHere;
            if (maxEndingHere == 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, -1, 0};//{6,-3,-10,0,2};
        MaxProducrSubArray producrSubArray = new MaxProducrSubArray();
        int res = producrSubArray.maxProductSubArray(arr);
        System.out.println(res);
    }
}
