package com.gb.datastructures.practice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The first unique element in the array
 * Sample Input
 * <p>
 * arr = {9,2,3,2,6,6,8}
 * <p>
 * Sample Output
 * <p>
 * 9
 */
public class FirstNonRepeatingElementInArray {
    public static int findFirstUnique(int[] arr) {
        Map<Integer, Integer> countElements = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            countElements.put(arr[i], 0);
        }
        for (int i = 0; i < arr.length; i++) {
            countElements.put(arr[i], countElements.get(arr[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countElements.entrySet()) {
            if (entry.getValue() <= 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
