package com.mst.strings;

import java.util.ArrayList;
import java.util.List;

public class PartitionLable_763 {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> partitionList=new ArrayList<>();
        for(int i=0;i<s.length();){

            int startIndex=i;
            int endIndex=s.lastIndexOf(s.charAt(i));

            for(int j=startIndex+1;j<endIndex;j++){

                int lastIndex=s.lastIndexOf(s.charAt(j));
                if(lastIndex>endIndex){
                    endIndex=lastIndex;
                }
            }
            i=endIndex+1;
            partitionList.add(endIndex-startIndex+1);


        }


        return partitionList;
    }
}
