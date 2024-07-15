package com.mst.array.prob;

class CheckMountainArray {

    public static void main(String[] args) {
        int arr[]={ 0,3,2,1};
       System.out.println( validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        boolean asecendingOrderCompletion=false,descendingOrderCompletion=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                    return false;
            if(arr[i]<arr[i+1] ){
                asecendingOrderCompletion=true;
                    continue;
                }else if(arr[i]>arr[i+1] && asecendingOrderCompletion){
                   // asecendingOrderCompletion=false;
                    continue;
                }

            if(asecendingOrderCompletion && descendingOrderCompletion){
                return true;
            }else return false;


        }
        return true;


    }
}