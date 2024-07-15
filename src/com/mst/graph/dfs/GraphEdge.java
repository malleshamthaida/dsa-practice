package com.mst.graph.dfs;

public class GraphEdge {
    private int source;
    private int dest;
    private int weight;

    public GraphEdge(int source,int dest,int weight){
        this.source=source;
        this.dest=dest;
        this.weight=weight;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSource() {
        return source;
    }

    public int getDest() {
        return dest;
    }

    public int getWeight() {
        return weight;
    }
}
