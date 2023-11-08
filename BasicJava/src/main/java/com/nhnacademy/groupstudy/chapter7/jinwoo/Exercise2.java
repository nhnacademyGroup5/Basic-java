package com.nhnacademy.groupstudy.chapter7.jinwoo;

public class Exercise2 {
    public static void main(String[] args) {
        int[][] orig = {
                { 1, 2, 3, 4, 5, 6 },
                { 10, 20, 30, 40, 50, 60 },
                { 100, 200, 300, 400, 500, 600 }
        };
        int[][] matrix = Matrix.setTranspose(orig);
        Matrix.print(matrix);
    }
}
