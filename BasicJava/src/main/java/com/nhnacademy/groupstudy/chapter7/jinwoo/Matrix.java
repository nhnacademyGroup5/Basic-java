package com.nhnacademy.groupstudy.chapter7.jinwoo;

import java.util.stream.IntStream;

public class Matrix {
    public static int[][] setTranspose(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];
        IntStream.range(0, rows)
                .forEach(row -> IntStream.range(0, columns)
                        .forEach(column -> result[column][row] = matrix[row][column])
                );
        return result;
    }

    public static void print(int[][] matrix){
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
