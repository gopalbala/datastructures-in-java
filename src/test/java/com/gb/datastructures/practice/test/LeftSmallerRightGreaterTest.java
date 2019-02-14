package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.LeftLessRightGreater;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gbalasubramanian on 13/02/19.
 */
public class LeftSmallerRightGreaterTest {
    LeftLessRightGreater leftLessRightGreater;
    @Before
    public void init() {
         leftLessRightGreater = new LeftLessRightGreater();

    }
    @Test
    public void findPositionTest(){
        int[] arr = //{7, 14, 16, 18};
        //{4, 3, 2, 7, 8, 9};
        {5, 1, 4, 3, 6, 8, 10, 7, 9};
        int number = leftLessRightGreater.findPos(arr);
        assertEquals(6,number);
    }
}
