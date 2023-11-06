package com.nhnacademy.groupstudy.chapter7.jiwon;

import java.util.Scanner;

public class ArraySortNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[100];
        int count = 0;


        System.out.println("Enter  numbers :");
        double input;
        while (count < 100) {
            input = scanner.nextDouble();
            if (input == 0) {
                break;
            }
            if (input > 0) {
                numbers[count] = input;
                count++;
            }
        }


        customSort(numbers, count);

        System.out.println("Sorted numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }

    public static void customSort(double[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
