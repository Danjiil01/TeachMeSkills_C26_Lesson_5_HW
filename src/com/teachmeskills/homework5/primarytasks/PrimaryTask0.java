package com.teachmeskills.homework5.primarytasks;

import java.util.Scanner;

/**
 * 0. Create a three-dimensional array of integers.
 * Using loops, go through the entire array and increase each
 * element for a given number. Let the number that will be
 * increase each element, set from the console.
 */

public class PrimaryTask0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number you want to multiply every array`s element by:");
        int increment = sc.nextInt();

        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += increment;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
