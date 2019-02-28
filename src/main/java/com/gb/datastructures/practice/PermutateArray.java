package com.gb.datastructures.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gbalasubramanian on 28/02/19.
 */
public class PermutateArray {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permutate(nums, 0, nums.length - 1);
        return res;
    }

    void permutate(int[] arr, int l, int r) {
        if (l == r) {
            List<Integer> list = new ArrayList<>();
            for (int i =0;i<arr.length;i++){
                list.add(arr[i]);
            }
            res.add(list);
        }
        for (int i = l; i <= r; i++) {
            arr = swap(arr, l, i);
            permutate(arr, l + 1, r);
            arr = swap(arr, l, i);
        }

    }

    int[] swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        return arr;
    }

    public static void main(String[] args) {
        PermutateArray permutateArray = new PermutateArray();
        int[] inp = {1, 2, 3};
        permutateArray.permutate(inp, 0, inp.length - 1);
       for (List list:permutateArray.res){
           System.out.println(list);
       }
    }
}
