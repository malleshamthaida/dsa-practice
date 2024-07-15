package com.mst.graph.dfs;

public class TestArrayGraph {
    public static void main(String[] args) {
        ArrayGraph ag=new ArrayGraph(3);
      ag.addEdge(0,1);
        ag.addEdge(1,2);
      ag.print();

    }
}
