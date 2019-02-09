package com.gb.datastructures.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Sample Input

 arr = {1,2,3,4}

 Sample Output

 arr = {24,12,8,6}
 */
public class ProductOfArrayExceptItself {
    public static int[] findProduct(int arr[]) {
        int[] product = new int[arr.length];
        // write your code here
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        //left[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            left[i] = arr[i - 1] * left[i - 1];

        }
        //right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = arr[i + 1] * right[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(right[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            product[i] = right[i] * left[i];
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(product[i] + " ");
        }
        return product;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        findProduct(arr);
    }
}
