package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.MergeTwoSortedArrays;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gbalasubramanian on 08/02/19.
 */
public class MergeTwoSortedArraysTest {
    MergeTwoSortedArrays mergeTwoSortedArrays;
    @Before
    public void init() {
        mergeTwoSortedArrays = new MergeTwoSortedArrays();
    }
    @Test
    public void mergeArraysTest() {
       int[] arr1 = {1,3,4,5};
       int[] arr2 = {2,6,7,8};
       assertEquals(8, MergeTwoSortedArrays.mergeArrays(arr1,arr2).length);
    }
}
