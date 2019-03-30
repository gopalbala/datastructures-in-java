package com.gb.datastructures.practice;

public class ReverseInteger {
    public int reverse(int x) {
        int newNum = Math.abs(x);
        int reversed = 0;
        int i = 0;
        while (newNum > 0) {
            newNum = newNum / 10;
            i++;
        }
        i--;
        newNum = Math.abs(x);
        while (i >= 0) {
            int rem = newNum % 10;
            newNum = newNum / 10;
            if ((Math.pow(10, i) * rem) > Integer.MAX_VALUE)
                return 0;
            reversed = reversed + ((int) Math.pow(10, i)) * rem;
            if (reversed < 0)
                return 0;
            i--;
        }
        if (x < 0)
            reversed = reversed * -1;

        return reversed;


    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int res = reverseInteger.reverse(1563847412);
        System.out.println(res);
    }
}
