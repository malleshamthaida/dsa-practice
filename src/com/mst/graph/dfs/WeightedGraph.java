package com.mst.graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class WeightedGraph {
    private List<GraphEdge>[] adjList;
    private int nodes;
    public WeightedGraph(int nodes){
        this.nodes=nodes;
        adjList=new ArrayList[nodes];
        for(int i=0;i<nodes;i++){
          adjList[i]=new ArrayList<>() ;
        }
    }

    public void addDirectedEdge(int source,int destination,int weight){
       GraphEdge edge=new GraphEdge(source,destination,weight);
       adjList[source].add(edge);
     }

     public void addUndirectedEdge(int source,int destination,int weight){
         GraphEdge sourceEdge=new GraphEdge(source,destination,weight);
         GraphEdge destEdge=new GraphEdge(destination,source,weight);
         adjList[source].add(sourceEdge);
         adjList[destination].add(destEdge);
     }

     public List<GraphEdge>[] getEdges(){
        return adjList;
     }

}
