package com.gb.datastructures.practice.strings;

import java.util.Arrays;

/**
 * Created by gbalasubramanian on 22/02/19.
 */
public class LongestUniqueSubString {
    static final int NO_OF_CHARS = 256;
    public static int lengthOfLongestSubstring(String s) {
        int curLen = 1;    // length of current substring
        int maxLen = 1;    // result
        int prevIndex;        //  previous index
        int i;
        int visited[] = new int[NO_OF_CHARS];

        for (i = 0; i < NO_OF_CHARS; i++) {
            visited[i] = -1;
        }

        visited[s.charAt(0)] = 0;

        /* Start from the second character. First character is
           already processed (curLen and maxLen are initialized
         as 1, and visited[str[0]] is set */
        for(i = 1; i < s.length(); i++)
        {
            prevIndex = visited[s.charAt(i)];

            /* If the current character is not present in
           the already processed substring or it is not
              part of the current NRCS, then do curLen++ */
            if(prevIndex == -1 || i - curLen > prevIndex)
                curLen++;

            /* If the current character is present in currently
               considered NRCS, then update NRCS to start from
               the next character of previous instance. */
            else
            {
                /* Also, when we are changing the NRCS, we
                   should also check whether length of the
                   previous NRCS was greater than maxLen or
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
