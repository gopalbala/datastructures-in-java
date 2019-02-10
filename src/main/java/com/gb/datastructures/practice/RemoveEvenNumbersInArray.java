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
    public int[] removeEven(int[] arr) {
        //Boundary condition
        if (arr.length == 0)
            return null;

        if (arr.length == 1 && arr[0] % 2 > 0)
            return arr;

        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 > 0) {
                oddCount++;
            }
        }
        
        int result[] = new int[oddCount];
        oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 > 0) {
                result[oddCount++] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
