package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 12/02/19.
 */
public class LeftLessRightGreater {
    int findPos(int[] arr) {
        int[] leftMax = new int[arr.length];
        printArray(arr);
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i - 1], leftMax[i - 1]);
        }
        printArray(leftMax);
        int rightMin = Integer.MAX_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {

            if (leftMax[i] < arr[i] && rightMin > arr[i]) {
                System.out.println(arr[i]);
                //return arr[i];
            }
            rightMin = Math.min(arr[i], rightMin);
        }
        return -1;

    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 9}; //{5, 1, 4, 3, 6, 8, 10, 7, 9};
        LeftLessRightGreater leftLessRightGreater = new LeftLessRightGreater();
        leftLessRightGreater.findPos(arr);
    }
}
