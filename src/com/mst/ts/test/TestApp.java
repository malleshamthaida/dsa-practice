package com.mst.ts.test;

public class TestApp {

    public static void main(String[] args) {
        //Input: s = "abcd", t = "bcdf", maxCost = 3
        String s = "abcd";
        String t = "bcdf";
        System.out.println(maxSubString(s, t, 3));
    }


    public static int maxSubString(String s, String t, int maxCost) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int startIndex = i;
            int maxSum = 0;
            int currentResult=0;
            while (maxSum < maxCost && startIndex<s.length()) {
                maxSum += Math.abs(s.charAt(startIndex) - t.charAt(startIndex));
                if (maxSum <= maxCost) {
                    currentResult++;
                    startIndex++;
                    result = Math.max(result, currentResult);
                } else {
                    break;
                }
            }
        }
        return result;
    }

}


