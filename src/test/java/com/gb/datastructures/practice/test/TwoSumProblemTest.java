package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.TwoSumProblem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gbalasubramanian on 09/02/19.
 */
public class TwoSumProblemTest {
    @Test
    public void findSumTest(){
        int[] input = {1,21,3,14,5,60,7,6};
        int[] result = TwoSumProblem.findSum(input,27);
        assertEquals(result[0] + result[1],27);

    }
}
