package com.teachmeskills.homework5.additionaltasks;

import java.util.Arrays;

/**
 * 5. Create a two-dimensional array of integers. Sort the elements into
 * rows of a two-dimensional array in ascending order.
 */

public class AdditionalTask5 {

    public static void main(String[] args) {
        int[][] array = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

}
