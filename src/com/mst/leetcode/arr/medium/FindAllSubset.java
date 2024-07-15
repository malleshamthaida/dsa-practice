package com.mst.leetcode.arr.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubset {
    public static void main(String[] args) {
        int arr[]={1,2,2};
        List<List<Integer>> resultSet=new ArrayList<>();
        backTrack(resultSet,new ArrayList(),arr,0);

        resultSet.forEach(e->
                {
                    System.out.print("[");
            e.forEach(el->System.out.print(el + " ") );
                    System.out.println("]");
        }

        );

    }

    public static void backTrack(List<List<Integer>> resultSet,List<Integer> tempSet,
                                                int [] nums,int start){
        resultSet.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++){
            tempSet.add(nums[i]);
            backTrack(resultSet,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }




}

}
