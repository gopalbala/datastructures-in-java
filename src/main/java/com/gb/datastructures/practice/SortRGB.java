package com.gb.datastructures.practice;

public class SortRGB {
    static void sortRGB(char[] input) {
        //Your code goes here
        int low = 0;
        int mid = 0;
        int high = input.length - 1;
        while (mid <= high) {
            switch (input[mid]) {
                case 'R': {
                    char t = input[low];
                    input[low] = input[mid];
                    input[mid] = t;
                    low++;
                    mid++;
                    break;
                }
                case 'G':
                    mid++;
                    break;
                case 'B': {
                    char t = input[mid];
                    input[mid] = input[high];
                    input[high] = t;
                    high--;
                    break;
                }
            }
        }
        System.out.println(input);
    }

    public static void main(String[] args) {
        char[] input =  {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
        sortRGB(input);
    }
}
