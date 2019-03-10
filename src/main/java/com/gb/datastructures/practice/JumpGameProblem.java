package com.gb.datastructures.practice;

public class JumpGameProblem {
    public boolean canJump(int[] nums) {
        int nextPos = nums[0];
        if (nums.length == 0)
            return false;
        if (nums[0] <= 0)
            return false;
        if (nums.length == 1)
            return true;
        int i = 0;
        while (nextPos <= nums.length) {
            if (nextPos <= i && nums[i] == 0)
                return false;
            if (i + nums[i] > nextPos) {
                nextPos = i + nums[i];
            }
            i++;
            if (nextPos >= nums.length - 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};//{3, 0, 8, 2, 0, 0, 1};//{2, 3, 1, 1, 4};//{2,0,0};{2, 5,0, 0};//{2, 3, 1, 1, 4};//{3,2,1,0,4};//{2, 3, 1, 1, 4};
        JumpGameProblem jumpGameProblem = new JumpGameProblem();
        boolean res = jumpGameProblem.canJump(nums);
        System.out.println(res);
    }
}
