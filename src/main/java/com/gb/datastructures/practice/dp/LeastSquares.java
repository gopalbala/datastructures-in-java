package com.gb.datastructures.practice.dp;

public class LeastSquares {

    public static int getMinSquares(int n) {
        //Input and output has already been taken for you
        // Write code here
        if (n == 0)
            return 0;
        int storage[] = new int[n + 1];
        storage[0] = 0;
        if (n > 0)
            storage[1] = 1;
        if (n > 1)
            storage[2] = 2;
        if (n > 2)
            storage[3] = 3;
        for (int i = 4; i <= n; i++) {
            int sq = (int) Math.sqrt(i);
            int ans = Integer.MAX_VALUE;
            while (sq > 0) {
                int remaning = i - (sq * sq);
                int sum = 1 + storage[remaning];
                sq--;
                if (ans > sum) {
                    ans = sum;
                }
                storage[i] = ans;
            }
        }
        return storage[n];
    }

    public static void main(String[] args) {
        getMinSquares(20);
    }
}
