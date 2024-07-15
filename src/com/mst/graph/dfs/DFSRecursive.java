package com.mst.graph.dfs;

import java.util.*;
import java.util.stream.Collectors;

public class DFSRecursive {

    public static void main(String[] args) {
        int v = 5 ;
        Integer[][] adj = {{2,3,1} , {0},{0,4}, {0}, {2}};
       List<List<Integer>> adjList= Arrays.stream(adj)
               .map(Arrays::asList)
               .collect(Collectors.toList());
       dfs(v,adjList);
    }

    public static void dfs(int numOfVertices,List<List<Integer>> adjList){
    Set<Integer> visited=new HashSet<>();
    List<Integer> resultOrder=new ArrayList<>();
    dfsTravel(0,adjList,visited,resultOrder);
    resultOrder.forEach(System.out::println);

    }


    public static void dfsTravel(int currentNode,List<List<Integer>> adjList,Set visitedNodeSet,List<Integer> resultList){
        visitedNodeSet.add(currentNode);
        resultList.add(currentNode);
        for(int connectedNode:adjList.get(currentNode)){
            if(!visitedNodeSet.contains(connectedNode)){
                dfsTravel(connectedNode,adjList,visitedNodeSet,resultList);
            }
        }



    }




}
