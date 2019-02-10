package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.FirstNonRepeatingElementInArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gbalasubramanian on 11/02/19.
 */
public class FirstNonRepeatingElementInArrayTest {
    @Test
    public void findFirstUniqueTest() {
        int[] input = {9, 2, 3, 2, 6, 6, 8};
        int res = FirstNonRepeatingElementInArray.findFirstUnique(input);
        assertEquals(9, res);
    }
}
