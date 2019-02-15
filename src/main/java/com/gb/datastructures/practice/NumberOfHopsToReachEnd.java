package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 15/02/19.
 */
public class NumberOfHopsToReachEnd {

    int getMinNumberOfHopsRecursive(int len) {

        if (len < 0)
            return 0;
        if (len == 0)
            return 1;

        return getMinNumberOfHopsRecursive(len - 1) + getMinNumberOfHopsRecursive(len - 2) + getMinNumberOfHopsRecursive(len - 3);

    }

    public static void main(String[] args) {
        NumberOfHopsToReachEnd numberOfHopsToReachEnd = new NumberOfHopsToReachEnd();
        System.out.println(numberOfHopsToReachEnd.getMinNumberOfHopsRecursive(5));
    }
}
