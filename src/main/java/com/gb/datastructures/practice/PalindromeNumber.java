package com.gb.datastructures.practice;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x > 0 && x < 10)
            return true;
        int temp = x;
        int res = 0;
        int i = 0;
        while (temp > 0) {
            temp = temp / 10;
            i++;
        }
        temp = x;
        i--;
        while (temp > 0) {
            int rem = temp % 10;
            temp = temp / 10;
            res = res + ((int) Math.pow(10, i)) * rem;
            i--;
        }
        System.out.println(res);
        if (res == x)
            return true;
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean res = palindromeNumber.isPalindrome(110);
        System.out.println(res);
    }
}
