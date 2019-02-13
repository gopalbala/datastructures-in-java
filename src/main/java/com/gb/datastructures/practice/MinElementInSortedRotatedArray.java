package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 13/02/19.
 */
public class MinElementInSortedRotatedArray {
    int minInSortedRotatedArray(int[] arr, int low, int high) {
        if (high < low)  return arr[0];
        if (high == low) return arr[low];
        int mid = (low + high) / 2;
        if (arr[mid] <= arr[low] && arr[mid] <= arr[mid + 1]) {
            return arr[mid];
        } else if (arr[mid] > arr[low] && arr[mid] < arr[mid + 1])
            return minInSortedRotatedArray(arr, low, mid);
        return minInSortedRotatedArray(arr,mid+1,high);

    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
//                 {4, 5, 6, 7, 1, 2, 3};
        MinElementInSortedRotatedArray minElementInSortedRotatedArray = new MinElementInSortedRotatedArray();
        System.out.println(minElementInSortedRotatedArray.minInSortedRotatedArray(arr,0,arr.length-1));
        int arr1[] =  {5, 6, 1, 2, 3, 4};
        int arr2[] =  {1, 2, 3, 4};
        int arr6[] =  {5, 6, 7, 1, 2, 3, 4};
        System.out.println(minElementInSortedRotatedArray.minInSortedRotatedArray(arr1,0,arr1.length-1));
        System.out.println(minElementInSortedRotatedArray.minInSortedRotatedArray(arr2,0,arr2.length-1));
        System.out.println(minElementInSortedRotatedArray.minInSortedRotatedArray(arr6,0,arr6.length-1));

    }
}