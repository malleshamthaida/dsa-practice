package com.mst.graph.dfs;

import java.util.*;

public class TestWeightedGraph {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(7);
        graph.addUndirectedEdge(1, 2, 4);
        graph.addUndirectedEdge(1, 3, 4);
        graph.addUndirectedEdge(2, 4, 3);
        graph.addUndirectedEdge(4, 6, 2);
        graph.addUndirectedEdge(2, 6, 6);
        graph.addUndirectedEdge(2, 5, 1);
        graph.addUndirectedEdge(5, 6, 3);


       int[] result = dijstrasAlgo( 1,graph);
       System.out.println(result[6]);
        Arrays.stream(result).forEach(item -> {
            System.out.println(item);
        });


    }

    public static void kruskalAlgoDriverMethod(){
        WeightedGraph graph = new WeightedGraph(4);
        graph.addUndirectedEdge(1, 2, 1);
        graph.addUndirectedEdge(1, 3, 3);
        graph.addUndirectedEdge(2, 3, 1);

        List<GraphEdge> result = kruskalaAlgo( graph);
        result.forEach(item -> {
            System.out.println(item.getSource() + "==>" + item.getDest() + "  dist=" + item.getWeight());
        });
    }

    public static List<GraphEdge> kruskalaAlgo(WeightedGraph graph) {
        List<GraphEdge> mst = new ArrayList<>();
        PriorityQueue<GraphEdge> queue = new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));
        Set<Integer> visitedSet = new HashSet<>();
        for (List<GraphEdge> edgeList : graph.getEdges()) {
            queue.addAll(edgeList);
        }
        while (!queue.isEmpty()) {
            GraphEdge currentEdge = queue.poll();
            if (visitedSet.contains(currentEdge.getSource()) &&
                    visitedSet.contains(currentEdge.getDest()))
                continue;
            mst.add(currentEdge);
            visitedSet.add(currentEdge.getSource());
            visitedSet.add(currentEdge.getDest());
        }
        return mst;
    }


    public static List<GraphEdge> primsAlgo(int vertices, WeightedGraph graph) {
        List<GraphEdge>[] edges = graph.getEdges();
        boolean mst[] = new boolean[edges.length];
        PriorityQueue<GraphEdge> queue = new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));
        List<GraphEdge> mstEdges = new ArrayList<>();
        mst[vertices] = true;
        queue.addAll(edges[vertices]);
        while (!queue.isEmpty()) {
            GraphEdge currentEdge = queue.poll();
            int dest = currentEdge.getDest();
            if (mst[dest]) continue;
            mstEdges.add(currentEdge);
            mst[dest] = true;
            queue.addAll(edges[dest]);
        }
        return mstEdges;
    }




    public static int[] dijstrasAlgo(int source,WeightedGraph graph){
        int[] distance=new int[graph.getEdges().length];
        Arrays.fill(distance,Integer.MAX_VALUE);
        PriorityQueue<GraphEdge> queue=new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));
          distance[source]=0;
        queue.add(new GraphEdge(source,source,0));
        while (!queue.isEmpty()){
            GraphEdge currentEdge=queue.poll();
            int dest=currentEdge.getDest();
            for(GraphEdge edge:graph.getEdges()[dest]){
                int newDist=distance[dest]+edge.getWeight();
                if(newDist<distance[edge.getDest()]){
                    distance[edge.getDest()]=newDist;
                    queue.add(new GraphEdge(source, edge.getDest(), newDist));
                }
            }
            }
        return distance;
    }
}
