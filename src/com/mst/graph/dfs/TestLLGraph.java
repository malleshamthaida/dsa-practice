package com.mst.graph.dfs;

public class TestLLGraph {
    public static void main(String[] args) {
        LLGraph ll=new LLGraph();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.addNode(6);

        ll.addEdge(1,2);
        ll.addEdge(1,4);
        ll.addEdge(1,5);
        ll.addEdge(2,3);
        ll.addEdge(3,6);
      //  ll.bfsTraversal(1);
       ll.dfsTraversal(1).forEach(System.out::println);

       // ll.print();
    }
}
