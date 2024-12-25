package com.mst.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class FIndBinaryMatrixShortestPath {
    public static void main(String[] args) {
       System.out.println( shortestPathBinaryMatrix(new int[][]{{0,1},
                                             {1,0}  })) ;
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1)
            return -1;
        int dirs[][]={{-1,-1},{-1,0},{-1,1},
                {0,-1},{0,1},
                {1,-1},{1,0},{1,1}
        };
        int m=grid.length;
        int n=grid[0].length;
        Queue<Integer[]> queue=new LinkedList<>();
        queue.add(new Integer[]{0,0,1});
        grid[0][0]=1;


        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-- >0){
                Integer cell[]=queue.poll();
                if(cell[0]==m-1 && cell[1]==n-1)
                    return cell[2];

                for(int[] dir: dirs){
                    int row=dir[0]+cell[0];
                    int col=dir[1]+cell[1];
                    if(row>=0 && col>=0 && row<m && col<n && grid[row][col]==0){
                        queue.add(new Integer[]{row,col,cell[2]+1});
                        grid[row][col]=1;
                    }
                }
            }


        }

        return -1;
    }
}
