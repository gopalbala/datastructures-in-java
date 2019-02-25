package com.gb.datastructures.practice.strings;

/**
 * Created by gbalasubramanian on 24/02/19.
 */
public class LongestPalindromicSubstring {
    public  static int longestPalindromicSubString(String str) {
        int n = str.length();
        boolean table[][] = new boolean[n][n];
        int maxLEn = 1;
        for (int i = 0; i < n; i++) {
            table[i][i] = true;
        }
        int start = 0;
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLEn = 2;
            }
        }

        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && str.charAt(i) ==
                        str.charAt(j)) {
                    table[i][j] = true;
                    if (k > maxLEn) {
                        start = i;
                        maxLEn = k;
                    }
                }
            }
        }
        System.out.println(str.substring(start, start + maxLEn ));
        return maxLEn;
    }

    public static void main(String[] args) {

        String str = "forgeeksskeegfor";
        System.out.println("Length is: " +
                longestPalindromicSubString(str));
    }
}
