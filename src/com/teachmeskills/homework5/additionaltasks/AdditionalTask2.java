package com.teachmeskills.homework5.additionaltasks;


/**
 * 2. Multiplication of two matrices
 * Create two 3x3 arrays of integers (two matrices).
 * Write a program to multiply two matrices.
 * First array: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Second array: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Expected result: 1 2 3 1 1 1 0 0 0
 */

public class AdditionalTask2 {

    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] secondMatrix = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}};

        int[][] resultMatrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
