package com.mst.strings;

import java.util.Arrays;
import java.util.List;

public class MinDiff {
    public static void main(String[] args) {
        System.out.println(findMinDifference(Arrays.asList(new String[]{"00:00","23:59"})));
    }


        public static  int findMinDifference(List<String> timePoints) {

            if(timePoints.size()<=1)
                return 0;

            int mins[] =new int[timePoints.size()];

            int minDiff=Integer.MAX_VALUE;
            for(int i=0;i<timePoints.size();i++){
                String ts=timePoints.get(i);
                mins[i]= Integer.parseInt(ts.substring(0,2))*60+
                        Integer.parseInt(ts.substring(3));
            }

            Arrays.sort(mins);

            for(int i=1;i<timePoints.size();i++){
                minDiff=Math.min(minDiff,mins[i]-mins[i-1]);
            }

            minDiff=Math.min(minDiff,mins[0]+(24*60-mins[timePoints.size()-1]));
            return minDiff;
        }

    }

