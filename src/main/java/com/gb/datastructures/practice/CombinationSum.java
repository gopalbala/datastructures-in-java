package com.gb.datastructures.practice;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinationSum(candidates, 0, 0, target, new ArrayList<>());
        return finalResult;
    }

    List<List<Integer>> finalResult = new ArrayList<>();

    void combinationSum(int[] candidates, int start, int current, int target, ArrayList<Integer> currentList) {
        if (current > target) {
            return;
        }
        if (current == target) {
            System.out.println(currentList);
            finalResult.add(currentList);
            return;
        }

        for (int j = start; j < candidates.length; j++) {
            currentList.add(candidates[j]);
            combinationSum(candidates, j, (current + candidates[j]), target, currentList);
            currentList.remove(currentList.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int[] arr = {2, 3, 6, 7};
        combinationSum.combinationSum(arr, 7);
    }
}
