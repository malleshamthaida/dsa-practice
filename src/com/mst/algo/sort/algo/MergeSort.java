package com.mst.algo.sort.algo;


public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {22, 30, 20, 40, 60, 70, 50, 91, 100, 10, 120};
       sort(arr, 0, (arr.length-1));
       System.out.println(arr );

    }

    public static void sort(int[] nums, int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int midIndex = lowerIndex +( higherIndex-lowerIndex) / 2;
            sort(nums, lowerIndex, midIndex);
            sort(nums, midIndex + 1, higherIndex);
            merge(nums,lowerIndex,midIndex,higherIndex);
        }


    }

    public static void  merge(int[] nums, int lowerIndex, int midIndex, int higherIndex) {
        int firstArrayLength = midIndex -lowerIndex+ 1;
        int secondArrayLength = higherIndex - midIndex;

        int[] firstArray = new int[firstArrayLength];
        int[] secondArray = new int[secondArrayLength];
        for (int index = 0; index < firstArrayLength; ++index) {
            firstArray[index] = nums[lowerIndex+index];
        }
        for (int index = 0; index < secondArrayLength; ++index) {
            secondArray[index] = nums[midIndex+1+index];
        }
        int i = 0, j = 0, k = lowerIndex;
         while (i < firstArrayLength && j < secondArrayLength) {
            if (firstArray[i] <= secondArray[j]) {
                nums[k++] = firstArray[i++];
            } else {
                nums[k++] = secondArray[j++];
            }
        }

        while(i<firstArrayLength){
            nums[k++]=firstArray[i++];
        }
        while(j<secondArrayLength){
            nums[k++]=secondArray[j++];
        }



    }
}
