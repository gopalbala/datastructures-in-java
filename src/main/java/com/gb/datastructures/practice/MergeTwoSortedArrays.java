package com.gb.datastructures.practice;

/**
 * In this problem, you have to implement the mergeArrays() function which merges two arrays in a sorted way.
 * Function Prototype
 * <p>
 * int[] mergeArrays(int[] arr1, int[] arr2)
 * <p>
 * Output
 * <p>
 * Merged array consisting all elements of both arrays in a sorted way
 * Sample Input
 * <p>
 * arr1 = {1,3,4,5}
 * <p>
 * arr2 = {2,6,7,8}
 * <p>
 * Sample Output
 * <p>
 * arr = {1,2,3,4,5,6,7,8}
 */
public class MergeTwoSortedArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int totalLen = arr1.length + arr2.length;
        int[] newArr = new int[totalLen];
        int i = 0, j = 0, count = 0;
        ;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                newArr[count++] = arr1[i++];
            } else {
                newArr[count++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            newArr[count++] = arr1[i++];
        }
        while (j < arr2.length) {
            newArr[count++] = arr2[j++];
        }
        return newArr;
    }
}
