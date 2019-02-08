package com.gb.datastructures.practice;

/**
 * An array with only odd integers
 * Sample Input
 * <p>
 * arr = {1,2,4,5,10,6,3}
 * <p>
 * Sample Output
 * <p>
 * arr = {1,5,3}
 */
public class RemoveEvenNumbersInArray {
    public  int[] removeEven(int[] arr) {
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 > 0) {
                evenCount++;
            }
        }
        int result[] = new int[evenCount];
        evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 > 0) {
                result[evenCount++] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
