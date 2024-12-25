package com.mst.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTwoSum {
    public static void main(String[] args) {
        int arr[]={3,2,4};
       Arrays.asList(twoSum(arr,6)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int secondNumber=target-nums[i];

            if(map.containsKey(secondNumber)){
                return new int[]{map.get(secondNumber),i};
            }

            map.put(nums[i],i);

        }
        return new int []{};



    }
}
