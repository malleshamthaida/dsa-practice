package com.mst.disjoint;

public class QuickUnion {
        int root[];

        public static void main(String[] args) {
        QuickUnion uf=new QuickUnion(8);
        uf.union(1,2);
        uf.union(2,5);
        System.out.println(uf.connected(1,5));
    }

    public QuickUnion(int size){
        root=new int[size];
        for(int i=0;i<size;i++){
            root[i]=i;
        }

    }

        public int find(int node){
            while (node != root[node]) {
                node=root[node];
            }
        return node;
    }

        public void union(int a,int b){
        int rootA=find(a);
        int rootB=find(b);
        if(rootA!=rootB){
          root[rootB]=rootA;
        }
    }

        public boolean connected(int x,int y){
        return find(x)==find(y);
    }
    }

