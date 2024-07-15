package com.mst.strings;

import java.util.Collections;
import java.util.HashMap;

public class LongestSubstringTwoDistinct {
    public static void main(String[] args) {
      System.out.println(  lengthOfLongestSubstringTwoDistinct("ccaabbbccc"));
    }

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int n = s.length();
        if (n < 3) return n;

        int left = 0;
        int right = 0;

        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

        int max_len = 2;

        while (right < n) {
            // when the slidewindow contains less than 3 characters
            hashmap.put(s.charAt(right), right++);

            // slidewindow contains 3 characters
            if (hashmap.size() == 3) {
                // delete the leftmost character
                int del_idx = Collections.min(hashmap.values());
                hashmap.remove(s.charAt(del_idx));
                // move left pointer of the slidewindow
                left = del_idx + 1;
            }
            max_len = Math.max(max_len, right - left);
        }
        return max_len;
    }
}