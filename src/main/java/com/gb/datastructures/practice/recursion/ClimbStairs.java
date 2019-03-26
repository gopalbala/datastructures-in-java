package com.gb.datastructures.practice.recursion;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n==0 || n==1)
            return 1;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public int climbStairsMemoization(int n) {
        int[] steps = new int[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i=2;i<n;i++){
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n-1];
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        int result = climbStairs.climbStairs(10);
        System.out.println(result);
        int result1 = climbStairs.climbStairsMemoization(10);
        System.out.println(result1);
        //1111 211 22 121 112
    }
}
