package com.mst;

import java.util.*;

public class TestAppT {

    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>(Arrays.asList(1,3,4,5,6,1));
        Set<Integer> set=new HashSet<>();

        numList.stream().filter(e->!set.add(e)).forEach(System.out::println);


    }
}
