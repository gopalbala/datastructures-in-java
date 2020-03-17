package com.gb.datastructures.practice.recursion;

import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        //code
        //The first line of input is T denoting the number of testcases.
        // T testcases follow.
        //Each testcase contains a single line of input containing N.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] cases = new int[T];
        for (int i = 0; i < T; i++) {
            cases[i] = sc.nextInt();
        }
//        for (int i = 0; i < T; i++) {
//            towerOfHanoi(cases[i], '1', '3', '2');
//        }
        for (int i = 0; i < T; i++) {
            int count = towerOfHanoi1(cases[i], '1', '3', '2', 0);
            System.out.println(count);
        }
    }

    static void towerOfHanoi(int n, char source, char dest, char temp) {
        if (n == 0)
            return;
        towerOfHanoi(n - 1, source, temp, dest);
        //move disk 1 from rod 1 to rod 2
        System.out.println("move disk " + n + " from rod " + source + " to rod " + dest);
        towerOfHanoi(n - 1, temp, dest, source);
    }

    static int towerOfHanoi1(int n, char source, char dest, char temp, int count) {
        if (n == 0)
            return count;
        count = towerOfHanoi1(n - 1, source, temp, dest, count);
        ++count;
        //move disk 1 from rod 1 to rod 2
        System.out.println("move disk " + n + " from rod " + source + " to rod " + dest);
        return towerOfHanoi1(n - 1, temp, dest, source, count);

    }
}
