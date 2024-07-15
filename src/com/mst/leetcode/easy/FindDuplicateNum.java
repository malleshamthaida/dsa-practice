package com.mst.leetcode.easy;

public class FindDuplicateNum {

    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {

        int n=nums.length-1;
        int nSum=(n*(n+1))/2;
        int originalSum=0;
        for(int i=0;i<=n;i++){
            originalSum+=nums[i];
        }
        return originalSum-nSum;


    }
}
