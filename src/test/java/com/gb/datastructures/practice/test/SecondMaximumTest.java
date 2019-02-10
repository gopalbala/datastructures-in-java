package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.SecondMaximum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gbalasubramanian on 11/02/19.
 */
public class SecondMaximumTest {
    SecondMaximum secondMaximum;

    @Before
    public void init() {
        secondMaximum = new SecondMaximum();
    }

    @Test
    public void findSecondMaximumLinearTimeTest() {
        int[] input = {9, 2, 3, 6};
        int res = secondMaximum.findSecondMaximum(input);
        assertEquals(6, res);
        res = secondMaximum.findSecondMaximumLinearTime(input);
        assertEquals(6, res);
    }
}
