package com.gb.datastructures.practice.strings;

import java.util.Arrays;

/**
 * Created by gbalasubramanian on 22/02/19.
 */
public class LongestUniqueSubString {
    static final int NO_OF_CHARS = 256;
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int cur_len = 1;    // length of current substring
        int max_len = 1;    // result
        int prev_index;        //  previous index
        int i;
        int visited[] = new int[NO_OF_CHARS];

        /* Initialize the visited array as -1, -1 is
         used to indicate that character has not been
         visited yet. */
        for (i = 0; i < NO_OF_CHARS; i++) {
            visited[i] = -1;
        }

        /* Mark first character as visited by storing the
             index of first   character in visited array. */
        visited[s.charAt(0)] = 0;

        /* Start from the second character. First character is
           already processed (cur_len and max_len are initialized
         as 1, and visited[str[0]] is set */
        for(i = 1; i < n; i++)
        {
            prev_index = visited[s.charAt(i)];

            /* If the current character is not present in
           the already processed substring or it is not
              part of the current NRCS, then do cur_len++ */
            if(prev_index == -1 || i - cur_len > prev_index)
                cur_len++;

            /* If the current character is present in currently
               considered NRCS, then update NRCS to start from
               the next character of previous instance. */
            else
            {
                /* Also, when we are changing the NRCS, we
                   should also check whether length of the
                   previous NRCS was greater than max_len or
                   not.*/
                if(cur_len > max_len)
                    max_len = cur_len;

                cur_len = i - prev_index;
            }

            // update the index of current character
            visited[s.charAt(i)] = i;
        }

        // Compare the length of last NRCS with max_len and
        // update max_len if needed
        if(cur_len > max_len)
            max_len = cur_len;

        return max_len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
