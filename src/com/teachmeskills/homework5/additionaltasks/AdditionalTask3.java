package com.teachmeskills.homework5.additionaltasks;

/**
 * 3. Create a two-dimensional array of integers. Print the amount to the console
 * all elements of the array.
 */

public class AdditionalTask3 {

    public static void main(String[] args) {
        int[][] array = {{98, 30, 22}, {90, 56, 71}, {10, 8, 19}};
        int sum = 0;

        for (int[] row : array) {
            for (int value : row) {
                sum += value;
            }
        }

        System.out.println("The sum of numbers in array: " + sum);
    }

}
