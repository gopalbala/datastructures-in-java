package com.gb.datastructures.practice;

/**
 * Sample Input
 * <p>
 * arr = {1,2,3,4,5,6,7,8,9} , 3
 * <p>
 * Sample output
 * arr = {7,8,9,1,2,3,4,5,6}
 */
public class RotateArrayByKPositions {
    public void rotateArray(int[] arr, int rotations) {
        int len = arr.length;
        int gcd = gcd(arr.length, rotations);
        printArray(arr);
        int i, j, k, temp;
        for (i = 0; i < gcd; i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + rotations;
                if (k >= len){
                    k = k - len;
                }
                if (k == i){
                    break;
                }
                arr[j] = arr[k];
                j = k;
                printArray(arr);
            }
            arr[j] = temp;
        }
       printArray(arr);
    }

    void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        RotateArrayByKPositions rotateArrayByKPositions = new RotateArrayByKPositions();
        rotateArrayByKPositions.rotateArray(arr, 3);
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        System.out.println(a % b);
        return gcd(b, a % b);
    }
}
