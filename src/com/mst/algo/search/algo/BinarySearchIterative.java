package com.mst.algo.search.algo;

public class BinarySearchIterative {


    public static void main(String[] args) {
        int arr[] = {20,30,40,50,60,70,80,91,100,110,120};
        System.out.println(searchElement(arr, 91));

    }

    public static boolean searchElement(int nums[], int key) {
        int length = nums.length;

        int lowerIndex = 0, midIndex = length / 2, higherIndex = length - 1;

        while (lowerIndex<=higherIndex) {
            midIndex=(lowerIndex+higherIndex)/2;

            if (key == nums[midIndex]) {
                return true;
            }
            if(key>nums[midIndex]){
                lowerIndex = midIndex+1;


            } else {
                higherIndex = midIndex-1;


            }

        }

            return false;

    }


}
