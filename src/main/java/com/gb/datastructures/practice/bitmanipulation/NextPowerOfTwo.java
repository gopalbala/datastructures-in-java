package com.gb.datastructures.practice.bitmanipulation;

public class NextPowerOfTwo {
    static int nextPower(int n) {
        int p = 1;
        System.out.println(n & (n - 1));
        if (n > 0 && (n & (n - 1)) == 0) {
            return n;
        }
        while (p < n) {
            p <<= 1;
        }
        return p;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(nextPower(n));
    }
}
