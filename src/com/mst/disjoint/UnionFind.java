package com.mst.disjoint;

public class UnionFind {
    int root[];


    public static void main(String[] args) {
        UnionFind uf=new UnionFind(8);
        uf.union(1,2);
        uf.union(2,5);
        System.out.println(uf.connected(1,5));
    }

    public UnionFind(int size){
        root=new int[size];
        for(int i=0;i<size;i++){
            root[i]=i;
        }

    }

    public int find(int node){
        return root[node];
    }

    public void union(int a,int b){
        int rootA=find(a);
        int rootB=find(b);
        if(rootA!=rootB){
            for(int i=0;i<root.length;i++){
                if(rootB==root[i]){
                    root[i]=rootA;
                }
            }
        }
    }

    public boolean connected(int x,int y){
        return find(x)==find(y);
    }
}
