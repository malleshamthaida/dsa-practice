package com.mst.leetcode.arr.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> resultSet=new ArrayList();
        int arr[]={1,2,3};
        backTrack(resultSet,new ArrayList(),arr);
        resultSet.forEach(e->
                {
                    System.out.print("[");
                    e.forEach(el->System.out.print(el + " ") );
                    System.out.println("]");
                }

        );
    }

    public static void backTrack(List<List<Integer>> resultSet, List<Integer> tempSet, int nums[]){
        if(tempSet.size()==nums.length) {
            resultSet.add(new ArrayList<>(tempSet));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(tempSet.contains(nums[i]))
                continue;
            tempSet.add(nums[i]);
            backTrack(resultSet,tempSet,nums);
            tempSet.remove(tempSet.size()-1);
        }

    }
}
