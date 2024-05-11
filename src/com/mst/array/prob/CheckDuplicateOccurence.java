package com.mst.array.prob;

import java.util.HashMap;
import java.util.Map;

public class CheckDuplicateOccurence {
static int arr[]={1,2,3,3,2};

    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
            }

        }

        map.entrySet().forEach(e->{
            System.out.println(e.getKey()+"---"+e.getValue());
        });


    }
}
