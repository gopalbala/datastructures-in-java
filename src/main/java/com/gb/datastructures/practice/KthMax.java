package com.gb.datastructures.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gbalasubramanian on 09/02/19.
 */
public class KthMax {
    void findKthSmallest(int[] array, int start, int end, int k) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);
            if (partitionIndex == k)
                return;
            else if (partitionIndex < k)
                findKthSmallest(array, partitionIndex + 1, end, k);
            else
                findKthSmallest(array, start, partitionIndex - 1, k);

            List<List<Integer>> a = new ArrayList<>();
            List l = Arrays.asList(array);
            a.add(l);
        }
    }

    public int kthMaxElement(int[] arr, int low, int high, int k) {
        if (low < high) {
            int partition = partition(arr, low, high);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            if (partition == k)
                return arr[k - 1];
            else if (partition > k) {
                return kthMaxElement(arr, low, partition - 1, k);
            } else {
                return kthMaxElement(arr, partition + 1, high, k);
            }
        }
        return 0;
    }


    int partition(int[] arr, int low, int high) {
        int j = low - 1;

        for (int i = low; i < high; i++) {
            if (arr[i] >= arr[high]) {
                j++;
                swap(arr, j, i);
            }
        }
        swap(arr, j + 1, high);
        return j + 1;
    }

    static int[] swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {10, 4, 5, 8, 6, 11, 26};

    }
}
