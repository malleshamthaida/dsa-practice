package com.mst.graph.dfs;

public class ArrayGraph {

    int[][] adjMatrix;
    int nodes;

    ArrayGraph(int nodes) {
        this.nodes = nodes;
        adjMatrix = new int[nodes][nodes];
    }


    public void addNode(int node) {
        int[][] tempMartix = new int[nodes + 1][nodes + 1];

        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                tempMartix[i][j] = adjMatrix[i][j];
            }
        }
        adjMatrix = tempMartix;

    }


    public void removeNode(int node) {
        int temp[][] = new int[nodes - 1][nodes - 1];
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                if (i != node & j != node) {
                    temp[i][j] = adjMatrix[i][j];
                }
            }
        }
        adjMatrix = temp;
    }

    public void addEdge(int source, int dest) {
        adjMatrix[source][dest] = 1;
        adjMatrix[dest][source] = 1;
    }

    public void removeEdge(int source, int dest) {
        adjMatrix[source][dest] = 0;
        adjMatrix[dest][source] = 0;
    }




    public void print() {

        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix.length; j++) {
                System.out.print(adjMatrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

}
