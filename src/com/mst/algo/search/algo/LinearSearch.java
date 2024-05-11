package com.mst.algo.search.algo;
//Time COmplexity - BC : O(1), wc : O(n) , AC : O(n) :::: SC : O(1)
//NOTES:
public class LinearSearch {

    public static void main(String[] args) {
        int arr[]={2,4,1,9,3};
       System.out.println( searchElemnent(arr,1));

    }

    public static  boolean searchElemnent(int nums[],int key){

        for(int index=0;index<nums.length;index++){
            if(nums[index]==key){
                return true;
            }
        }
        return false;


    }
}
