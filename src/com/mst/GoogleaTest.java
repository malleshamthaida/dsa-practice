package com.mst;

import java.util.HashSet;
import java.util.Set;

public class GoogleaTest {

    int initNumber=0;
    Set<Integer> set=new HashSet<>();

    public void start(int num){
       initNumber=num;
    }

    public void ack(int num){
        set.add(num);
    }

    public int getLowestUnack(){
        for(int i=initNumber;i< 100;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        GoogleaTest tt=new GoogleaTest();
        tt.start(10);
        tt.ack(11);
        tt.ack(10);
        tt.ack(15);
        tt.ack(13);
        tt.ack(14);
        tt.ack(23);
        tt.ack(12);

        System.out.println(tt.getLowestUnack());
    }
}

