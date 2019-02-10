package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.RemoveEvenNumbersInArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gbalasubramanian on 08/02/19.
 */

public class RemoveEvenNumbersInArrayTest {
    RemoveEvenNumbersInArray removeEvenNumbersInArray;

    @Before
    public void init() {
        removeEvenNumbersInArray = new RemoveEvenNumbersInArray();
    }

    @Test
    public void removeEvenTest() {
        int[] input1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] res = {1, 3, 5, 7};
        assertEquals(res.length, removeEvenNumbersInArray.removeEven(input1).length);
        assertEquals(1, removeEvenNumbersInArray.removeEven(input1)[0]);
    }
}
