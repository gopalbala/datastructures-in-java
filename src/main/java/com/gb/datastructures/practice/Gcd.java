package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 10/02/19.
 */
public class Gcd {
    public int gcd(int a, int b) {
        System.out.println("a= " + a + " b= "+ b);

        System.out.println();
        if (b == 0)
            return a;
        //System.out.println(a%b);
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Gcd gcd = new Gcd();
        System.out.println(gcd.gcd(7,2));
        System.out.println(gcd.gcd(120,90));
    }
}
