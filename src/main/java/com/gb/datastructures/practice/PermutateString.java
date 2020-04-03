package com.gb.datastructures.practice;

import java.util.*;

/**
 * Created by gbalasubramanian on 19/02/19.
 */

public class PermutateString {
    static SortedSet<String> s = new TreeSet<>();

    static void permutate(String input, int l, int r) {
        if (l == r) {
            //System.out.println(input);
            s.add(input);
        }
        for (int i = l; i <= r; i++) {
            input = swap(input, l, i);
            permutate(input, l + 1, r);
            input = swap(input, l, i);
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
        String input = "bac";
        permutate(input, 0, input.length() - 1);
        // List<String> s = new ArrayList<>();
//        for (String s1: s) {
//            System.out.println(s1);
//        }
//        System.out.println(s);
        List<Integer> integerList = new ArrayList<>();
        int[] a = new int[]{5, 2, 7, 8, -2, 25, 25};
        for (int i : a) {
            integerList.add(i);
        }
        Collections.sort(integerList);

        Collections.sort(integerList);
        List<Integer> meanderingList = new ArrayList<>();
        int l = 0;
        int r = integerList.size() - 1;
        int i = 0;
        System.out.println(integerList);
        while (l < r) {
            meanderingList.add(i++, integerList.get(r));
            meanderingList.add(i++, integerList.get(l));
            l++;
            r--;
        }
        if (l == r) {
            meanderingList.add(i++, integerList.get(l));
        }
        System.out.println(meanderingList);
    }
}
