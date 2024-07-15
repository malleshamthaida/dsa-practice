package com.mst.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FindSingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }

        }

        for(Map.Entry entry:map.entrySet()){
            if(entry.getValue() ==(Integer) 1){
                return (Integer)entry.getKey();
            }

        }
        return 0;

    }
}
