package com.teachmeskills.homework5.additionaltasks;

/**
 * 4. Create a two-dimensional array. Print the diagonals of the array to the console.
 */

public class AdditionalTask4 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("First diagonal:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        System.out.println("Second diagonal:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - 1 - i] + " ");
        }
    }

}
