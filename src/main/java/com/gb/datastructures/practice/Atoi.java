package com.gb.datastructures.practice;

public class Atoi {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty())
            return 0;
        int index = 0, sign = 1, total = 0;
        //1. Remove Spaces
        while(str.charAt(index) == ' ' && index < str.length())
            index ++;
        //2. Handle signs
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }
        //3. Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;
            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }

    public static void main(String[] args) {
        Atoi atoi = new Atoi();
        long res = atoi.myAtoi("+1");//"3.14159");//"-91283472332");//"-91283472332");//"-   234");// "words and -987"); //words and 987
        System.out.println(res);
    }
}
