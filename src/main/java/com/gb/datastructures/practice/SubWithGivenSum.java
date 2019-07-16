package com.gb.datastructures.practice;

import java.util.HashMap;

public class SubWithGivenSum {

    static void subArraySum(int[] arr, int sum) {
        int n = arr.length;
        int start = 0;
        int end = -1;
        int currSum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (currSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (hashMap.containsKey(currSum - sum)) {
                start = hashMap.get(currSum - sum) + 1;
                end = i;
                break;
            }
            hashMap.put(currSum, i);
        }
        if (end == -1) {
            System.out.println("subarray with given sum does not exists");
        } else {
            System.out.printf("subarray with sum exists with start %d and end %d", start, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int sum = -10;
        subArraySum(arr, sum);
    }
}
