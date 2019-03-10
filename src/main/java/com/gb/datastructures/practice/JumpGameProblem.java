package com.gb.datastructures.practice;

public class JumpGameProblem {
    public boolean canJump(int[] nums) {
        int nextPos = 0;
        if (nums.length == 0)
            return false;
        if (nums[0] <= 0)
            return false;
        if (nums.length == 1)
            return true;
        int i = 0;
        while ( nextPos <= nums.length) {
            nextPos += nums[i];
            i += nums[i];
            if (i< nums.length && nums[i] == 0)
                return false;
            if (nextPos >= nums.length)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};//{2, 3, 1, 1, 4};
        JumpGameProblem jumpGameProblem = new JumpGameProblem();
        boolean res = jumpGameProblem.canJump(nums);
        System.out.println(res);
    }
}
