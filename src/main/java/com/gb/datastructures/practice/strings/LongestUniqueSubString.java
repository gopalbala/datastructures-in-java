package com.gb.datastructures.practice.strings;

import java.util.Arrays;

/**
 * Created by gbalasubramanian on 22/02/19.
 */
public class LongestUniqueSubString {
    public static int lengthOfLongestSubstring(String s) {
        int visited[] = new int[256];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = -1;
        }
        int curLen = 1;
        int maxLen = 1;
        int prevIndex;

        visited[s.charAt(0)] = 0;

        /* Start from the second character. First character is
           already processed (curLen and maxLen are initialized
         as 1, and visited[str[0]] is set */
        for(int i = 1; i < s.length(); i++)
        {
            prevIndex = visited[s.charAt(i)];

            /* If the current character is not present in
           the already processed substring or it is not
              part of the current non repeated character in string , then do curLen++ */
            if(prevIndex == -1 || i - curLen > prevIndex)
                curLen++;

            /* If the current character is present in currently
               considered non repeated character in string, then update non repeated character in string to start from
               the next character of previous instance. */
            else
            {
                /* Also, when we are changing the non repeated character in string, we
                   should also check whether length of the
                   previous non repeated character in string was greater than maxLen or
                   not.*/
                if(curLen > maxLen)
                    maxLen = curLen;

                curLen = i - prevIndex;
            }

            // update the index of current character
            visited[s.charAt(i)] = i;
        }

        // Compare the length of last NRCS with maxLen and
        // update maxLen if needed
        if(curLen > maxLen)
            maxLen = curLen;

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
