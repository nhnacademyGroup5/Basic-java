package com.nhnacademy.groupstudy.chapter7.jinwoo.matrix;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class Matrix<T> {
    private final T[][] matrix;
    private final int rows;
    private final int columns;

    public Matrix(T[][] arr){
        this.matrix = arr;
        this.rows = arr.length;
        this.columns = arr[0].length;
    }

    public boolean isTranspose(){
        AtomicBoolean result = new AtomicBoolean(false);
        IntStream.range(0, rows)
                .forEach(row -> IntStream.range(0, columns)
                        .forEach(column -> result.set(matrix[row][column].equals(matrix[column][row]))));
        return result.get();
    }

    public void print(){
        for (T[] row : matrix) {
            for (T item : row) {
                System.out.println(item);
            }
            System.out.println();
        }
    }
}
