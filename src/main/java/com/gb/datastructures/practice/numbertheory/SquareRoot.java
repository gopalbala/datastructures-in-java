package com.gb.datastructures.practice.numbertheory;

/**
 * Created by gbalasubramanian on 04/03/19.
 */
public class SquareRoot {
    public static int squareRoot(int n) {
        int start = 0, end = n;
        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int sq = mid * mid;
            if (sq == n) {
                return mid;
            } else if (sq > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(49));
    }
}
