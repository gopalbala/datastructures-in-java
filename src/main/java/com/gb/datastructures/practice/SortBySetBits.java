package com.gb.datastructures.practice;

import java.util.*;

public class SortBySetBits {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 6, 5};
        SortedMap<Integer, SortedSet<Integer>> sm = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            BitSet bs = BitSet.valueOf(new long[]{arr[i]});

            if (sm.get(bs.cardinality()) != null) {
                SortedSet<Integer> sortedSet = sm.get(bs.cardinality());
                sortedSet.add(arr[i]);
                sm.put(bs.cardinality(), sortedSet);
            } else {
                SortedSet<Integer> sortedSet = new TreeSet<>();
                sortedSet.add(arr[i]);
                sm.put(bs.cardinality(), sortedSet);
            }
        }

        for (Map.Entry<Integer, SortedSet<Integer>> setEntry : sm.entrySet()){
            SortedSet<Integer> sortedSet = setEntry.getValue();
            for (Integer i : sortedSet) {
                System.out.println(i);
            }
        }
    }
}
