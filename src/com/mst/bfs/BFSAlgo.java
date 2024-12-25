package com.mst.bfs;

import java.util.*;
import java.util.stream.Collectors;

public class BFSAlgo {

   /* [
        [0,1,1]
        [1,0,1]
        [1,1,0]


            ]*/

    public static void main(String[] args) {
    Integer arr[][]={{0,1,1},
            {1,0,1},
            {1,1,0}
    };
      List<List<Integer>> list= Arrays.stream(arr)
                .map(Arrays::asList)
                .collect(Collectors.toList());
        bfsAlgo(list,1);

    }

     static void bfsAlgo(List<List<Integer>>  graph,int vertex){
        boolean[] visited =new boolean[graph.size()];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(vertex);
        while(!queue.isEmpty()){
            int currentNode=queue.poll();
            System.out.println(currentNode);
            visited[currentNode]=true;
            for(int i=0;i<graph.size();i++){
                //if(graph.get(currentNode)==1) !visited[connectedNode]){
                   // queue.add(connectedNode);
                //}
            }
        }
    }


}
