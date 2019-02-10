package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.KthMax;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gbalasubramanian on 09/02/19.
 */
public class KthMaxElementTest {

    KthMax kthMax;

    @Before
    public void init() {
        kthMax = new KthMax();
    }

    @Test
    public void kthMaxElementTest() {
        int arr[] = {10, 4, 5, 8, 6, 11, 26};
        int res = kthMax.kthMaxElement(arr, 0, arr.length - 1, 4);
        assertEquals(8, res);

        res = kthMax.kthMaxElement(arr, 0, arr.length - 1, 3);
        assertEquals(10, res);

        res = kthMax.kthMaxElement(arr, 0, arr.length - 1, 5);
        assertEquals(6, res);
    }
}
