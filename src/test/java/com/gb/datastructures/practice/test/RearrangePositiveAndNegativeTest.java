package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.RearrangePositiveAndNegative;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by gbalasubramanian on 10/02/19.
 */
public class RearrangePositiveAndNegativeTest {
    @Test
    public void reArrangeTest() {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        int[] res1 = RearrangePositiveAndNegative.reArrange(arr);
        for (int i=0;i<3;i++){
            Assert.assertTrue(res1[i] < 0);
        }
        for (int i =3;i<res1.length;i++){
            Assert.assertTrue(res1[i] > 0);
        }
    }
}
