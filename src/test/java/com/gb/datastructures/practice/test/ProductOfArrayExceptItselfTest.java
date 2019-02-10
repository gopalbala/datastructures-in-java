package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.ProductOfArrayExceptItself;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by gbalasubramanian on 09/02/19.
 */
public class ProductOfArrayExceptItselfTest {
    @Test
    public void findProductTest() {
        int[] arr = {1, 2, 3, 4};
        int[] exp = {24,12,8,6};
        int[] result = ProductOfArrayExceptItself.findProduct(arr);
        assertEquals(result[0], 24);
        Assert.assertArrayEquals(exp,result);
    }
}
