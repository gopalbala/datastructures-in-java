package com.gb.datastructures.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gbalasubramanian on 26/02/19.
 */
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> power =  new ArrayList<>();
        for(int i = 0;i<Math.pow(2,len);i++){
            List<Integer> res = new ArrayList<>();
            for (int j =0;j<len;j++) {
                if((i & (1<<j)) > 0) {
                    res.add(nums[j]);
                }
            }
            power.add(res);
        }
        return power;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }
}
