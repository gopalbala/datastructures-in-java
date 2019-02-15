package com.gb.datastructures.practice;

/**
 * Created by gbalasubramanian on 15/02/19.
 */
public class ConvertToBinary {
    public byte[] getBinary(int n) {
        byte[] bytes = new byte[32];
        int count = 31;
        while (n > 0) {
            bytes[count--] = (byte) (n % 2 > 0 ? 1 : 0);
            n = n / 2;
        }
        return bytes;
    }

    public static void main(String[] args) {
        ConvertToBinary convertToBinary = new ConvertToBinary();
        byte[] bytes = convertToBinary.getBinary(10);
        for (int i =0;i<bytes.length;i++){
            System.out.print(bytes[i]);
        }
        System.out.println();

    }
}
