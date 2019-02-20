package com.gb.datastructures.practice.com.gb.datastructures.practice.strings;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"

 Input: s = "PAYPALISHIRING", numRows = 4
 Output: "PINALSIGYAHRPI"
 Explanation:

 P     I    N
 A   L S  I G
 Y A   H R
 P     I

 */
public class ZigZagConversion {
    static String convert(String s, int num) {
        String result = "";
        String[] temp = new String[num];
        for (int i = 0; i < num; i++) {
            temp[i] = "";
        }
        int pos = 0, rowIndex = num - 1, step = 1;
        if (num == 1 || s.length() < num) {
            return s;
        }
        for (int i=0;i<s.length();i++) {
            temp[pos] += s.charAt(i);
            if (pos == 0){
                step = 1;
            } else if(pos == rowIndex) {
                step = -1;
            }
            pos = pos + step;
        }
        for (int i=0;i<num;i++){
            result += temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("PAYPALISHIRING", 4));
    }
}
