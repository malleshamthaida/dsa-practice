package com.mst.algo.search.algo;
//Time
public class LinearSearchJump {
    public static void main(String[] args) {
        int arr[]={2,4,1,9,3,93,7,5,91,43};
        System.out.println( searchElement(arr,93));

    }

    public static  boolean searchElement(int nums[],int key){
        int leftIndex=0,rightIndex=nums.length-1;
        int counter=0;
       for(int index=0;index<nums.length;index++){
           counter++;
    System.out.println("-----Count : "+counter);
           if(leftIndex>rightIndex)
               break;
           if(nums[leftIndex]==key ||
                   nums[rightIndex]==key){
               return true;
           }
           leftIndex++;
           rightIndex--;

       }
       return false;

    }
}
