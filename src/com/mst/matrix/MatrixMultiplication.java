package com.mst.matrix;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][] = {{1, 2}, {3, 4}};
        int b[][] = {{1, 1}, {1, 1}};
        int[][] res = matrixMultiplication(a, b);

        for(int[] row:res){
            for(int col:row){
                System.out.print(col+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {

            }
        }
    }

    public static int[][] matrixMultiplication(int[][] A, int[][] B) {

        if (A.length != B[0].length) {
            System.out.println("Multiplication not possible");
            return new int[][]{};
        }
        int[][] resultArr = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < B.length; k++)
                    resultArr[i][j] += A[i][k] * B[k][i];
            }
        }
        return resultArr;
    }


}
