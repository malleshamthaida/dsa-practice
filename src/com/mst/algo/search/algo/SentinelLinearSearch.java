package com.mst.algo.search.algo;
//Time COmplexity - BC : O(1), wc : O(n) , AC : O(n) :::: SC : O(1)
//NOTES::
public class SentinelLinearSearch {

    public static void main(String[] args) {
        int arr[]={2,4,1,9,3};
        System.out.println( sentinelSearchElement(arr,3));

    }

    public static  boolean sentinelSearchElement(int nums[],int key){
        int length=nums.length;
        int last=nums[length-1];
            nums[length-1]=key;

            int i=0;
            while(nums[i]!=key){
                i++;
                nums[length - 1] = last;

                if ((i < length - 1) || (nums[length - 1] == key)) {
                    System.out.print("Element present at index "
                            + i);
                    return true;
                }
                else {
                    System.out.print("Element not present");
                    return false;
                }

            }

        return false;


    }
}
