package com.mst.leetcode.arr;

import java.util.Arrays;

public class DUplicateOccurenceaWithZero {
    public static void main(String[] args) {
        int[] nums={1,0,2,3,0,4,5,0};
        duplicateZeros(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

        public static void duplicateZeros(int[] arr) {

            for(int index=0;index<arr.length-1;index++){

                if(arr[index]==0){

                    for(int j=arr.length-2;j>index;j--){
                        arr[j+1]=arr[j];
                    }
                    arr[index+1]=0;
                    ++index;

                }
            }

        }
    }

