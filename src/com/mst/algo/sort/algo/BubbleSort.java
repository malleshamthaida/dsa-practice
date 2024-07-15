package com.mst.algo.sort.algo;

import java.util.Arrays;

//TzimeComplexity BC : O(n) if already sorted :: avg & worst case O(n^2)
//It is space efficient algo SC :: O(1)

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {22, 30, 20, 40, 60, 70, 50, 91, 100, 10, 120};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);

    }

    static void bubbleSort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
