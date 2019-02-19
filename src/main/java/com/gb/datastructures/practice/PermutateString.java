package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 19/02/19.
 */
public class PermutateString {
    static void permutate(String input, int l, int r) {
        if (l == r)
            System.out.println(input);

        for (int i=l;i <= r;i++) {
            input= swap(input, l, i);
            permutate(input, l+1, r);
            input = swap(input, l,i);
        }
    }

    static String swap(String inp, int l, int r) {
        char[] chars = inp.toCharArray();
        char t = chars[l];
        chars[l] = chars[r];
        chars[r] = t;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String input = "abc";
        permutate(input,0,input.length()-1);
    }
}
