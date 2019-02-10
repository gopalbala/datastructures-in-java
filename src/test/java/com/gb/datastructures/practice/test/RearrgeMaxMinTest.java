package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.ReArrageArrayMaxMin;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gbalasubramanian on 10/02/19.
 */
public class RearrgeMaxMinTest {
    @Test
    public void reArrangeTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] res = ReArrageArrayMaxMin.maxMin(arr);
        int[] expected = {7, 1, 6, 2, 5, 3, 4};
        Assert.assertArrayEquals(res, expected);
        boolean[] booleans = new boolean[2];
        for (int i = 0; i < booleans.length; i++)
            System.out.print(booleans[i] + " ");

    }
}
