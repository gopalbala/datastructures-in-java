package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 10/02/19.
 */
public class ReArrageArrayMaxMin {
    public static int[] maxMin(int[] arr) {
        //Arrays.sort(arr);
        int[] result = new int[arr.length];
        int i = 0, j = arr.length - 1;
        int iter = 0;

        while (i < j) {
            result[iter++] = arr[j--];
            result[iter++] = arr[i++];
        }
        if (arr.length % 2 > 0)
            result[arr.length-1] = arr[i];
        // Write - Your - Code
       return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        maxMin(arr);
    }
}
