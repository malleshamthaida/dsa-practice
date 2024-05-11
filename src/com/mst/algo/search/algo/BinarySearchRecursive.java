package com.mst.algo.search.algo;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = {20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        System.out.println(searchElement(arr, 0,11,90));

    }

    public static boolean searchElement(int[] nums, int lowerindex, int higherIndex, int key) {

        int midIndex = (lowerindex + higherIndex) / 2;
        if (higherIndex >= lowerindex) {
            if (nums[midIndex] == key)
                return true;
            if (nums[midIndex] > key)
                return searchElement(nums, lowerindex, midIndex - 1, key);
            return searchElement(nums, midIndex + 1, higherIndex, key);

        }
        return false;


    }
}
