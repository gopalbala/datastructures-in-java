package com.gb.datastructures.practice;

public class ArrayJourney {
    public static void main(String[] args) {
        int[] arr = new int[]{3,10,-20,-5,2};//{10, 2, -10, 5, 20};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] >= 0 && sum + arr[i] >= sum) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
