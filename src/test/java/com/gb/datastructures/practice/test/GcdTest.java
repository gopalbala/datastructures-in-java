package com.gb.datastructures.practice.test;

import com.gb.datastructures.practice.Gcd;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gbalasubramanian on 14/02/19.
 */
public class GcdTest {
    @Test
    public void getGcdTest() {
        Gcd gcd1 = new Gcd();
       int gcd = gcd1.gcd(150,140);
       assertEquals(10,gcd);
       gcd = gcd1.gcd(4,5);
    }
}
