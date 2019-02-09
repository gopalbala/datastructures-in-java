package com.gb.datastructures.practice;

import java.util.HashSet;

/**
 *
 * Sample Input

 arr = {1,21,3,14,5,60,7,6}

 value = 27

 Sample Output

 arr = {21,6} or {6,21}
 */
public class TwoSumProblem {
    public static int[] findSum(int[] arr, int value)
    {
        int[] result = new int[2];
        // write your code here
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            int diff = value - arr[i];
            if(hashSet.contains(diff)){
                result[0] = arr[i];
                result[1] = diff;
                break;
            }
        }
        return result;   // return the elements in the array whose sum is equal to the value passed as parameter
    }
}
