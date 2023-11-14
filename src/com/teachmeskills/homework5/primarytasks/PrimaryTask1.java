package com.teachmeskills.homework5.primarytasks;

/**
 * 1. Chessboard
 * Create a program to color a chessboard using a loop.
 * Create a two-dimensional 8x8 array of Strings. Using loops to set
 * cycle elements have the values B(Black) or W(White).
 */

public class PrimaryTask1 {

    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessboard[i][j] = "W";
                } else {
                    chessboard[i][j] = "B";
                }
            }
        }
        for (String[] row : chessboard) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

}
