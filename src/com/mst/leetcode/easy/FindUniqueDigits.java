package com.mst.leetcode.easy;

public class FindUniqueDigits {
    public static void main(String[] args) {
        System.out.println(findUniqueDigits(11, 12));
    }

    public static int findUniqueDigits(int a, int b) {
        int resultCounter = 0;
        for (int i = a; i <= b; i++) {
            if (!checkUnique(i))
                resultCounter++;
        }
        return b - a - resultCounter + 1;
    }

    public static boolean checkUnique(int num) {
        int numArr[] = new int[10];
        while (num > 0) {
            int rem = num % 10;
            if (numArr[rem]++ > 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
