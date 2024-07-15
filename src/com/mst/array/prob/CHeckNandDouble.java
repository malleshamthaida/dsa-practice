package com.mst.array.prob;


class CHeckNandDouble {
    public static void main(String[] args) {
        int arr[]={-2,0,10,-19,4,6,-8};
      System.out.println(checkIfExist(arr));
    }

    public static  boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==2*arr[j] || 2*arr[i] ==arr[j])
                    return true;

            }

        }
        return false;

    }
}
