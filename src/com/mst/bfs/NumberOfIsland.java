package com.mst.bfs;


import java.util.LinkedList;
import java.util.Queue;

class NumberOfIsland {

    public static void main(String[] args) {
char[][] arr={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
System.out.println(numIslands(arr));

    }
    public static int numIslands(char[][] grid) {
        if (grid.length<0)
            return 0;
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]==false && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,grid,visited);
                }

            }
        }
        return count;
    }

    public static void bfs(int row,int col,char[][] grid,boolean[][]visited){
        visited[row][col]=true;
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(row,col));

        int m=grid.length;
        int n=grid[0].length;

        while(!queue.isEmpty()){
            int r=queue.peek().first;
            int c=queue.peek().second;
            queue.remove();

            for(int deltaRow=-1;deltaRow<=1;deltaRow++){
                for(int deltaCol=-1;deltaCol<=1;deltaCol++){
                    int nRow=r+deltaRow;
                    int nCol=c+deltaCol;

                    if(nRow>=0
                            && nRow<m &&
                            nCol>=0 && nCol < n &&
                            grid[nRow][nCol]=='1' && visited[nRow][nCol]==false){
                        visited[nRow][nCol]=true;
                        queue.add(new Pair(nRow,nCol));
                    }

                }
            }

        }


    }

}

class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}