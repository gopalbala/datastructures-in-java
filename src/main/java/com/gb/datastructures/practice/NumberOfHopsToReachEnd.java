package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 15/02/19.
 */
public class NumberOfHopsToReachEnd {

    int getNumberOfHopsRecursive(int len) {

        if (len < 0)
            return 0;
        if (len == 0)
            return 1;

        return getNumberOfHopsRecursive(len - 1) + getNumberOfHopsRecursive(len - 2) + getNumberOfHopsRecursive(len - 3);

    }

    int getNumberOfHops(int len) {
        int[] ways = new int[len + 1];
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;
        for (int i = 3; i <= len; i++) {
            ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];
        }
        return ways[len];
    }

    public static void main(String[] args) {
        NumberOfHopsToReachEnd numberOfHopsToReachEnd = new NumberOfHopsToReachEnd();
        System.out.println(numberOfHopsToReachEnd.getNumberOfHopsRecursive(5));
        System.out.println(numberOfHopsToReachEnd.getNumberOfHops(5));
    }
}
