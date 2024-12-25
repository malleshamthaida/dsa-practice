package com.mst.strings;

public class FindDifferntChar{

    public static void main(String[] args) {
      System.out.println(  findTheDifference("abc","abcd"));
    }
        public static  char findTheDifference(String s, String t) {
            int n = s.length();
            int sum = t.charAt(n);
            for(int i=0;i<n;i++){
                sum+=t.charAt(i)-s.charAt(i);
            }
            return (char)sum;
        }
    }

