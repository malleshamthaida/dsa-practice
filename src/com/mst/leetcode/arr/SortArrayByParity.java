package com.mst.leetcode.arr;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        sortArrayByParity(arr);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println();
    }

    public static int[] sortArrayByParity(int arr[]){
        int i=0,j=arr.length-1;

        while(i<j){
            if(arr[i]%2>arr[j]%2){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[i]%2==0) i++;
            if(arr[j]%2==1) j--;
        }



        return arr;
    }
}
