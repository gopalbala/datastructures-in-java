package com.gb.datastructures.practice.bitmanipulation;

public class ReverseBits {
    public int reverseBits(int n) {
        int temp = n;
        int res = 0;
        while (temp>0){
           // System.out.println(temp>>1);
            res = res+ temp >> 1;
            temp = temp>>1;

        }
        System.out.println(res);
        return temp;
    }

    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        reverseBits.reverseBits(43261596);
    }
}
