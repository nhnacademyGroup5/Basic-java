package com.nhnacademy.groupstudy.chapter4.jinwoo;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * A functional interface that defines a function
 * that has one parameter of type double[] and that
 * returns a value of type double.
 */
@FunctionalInterface
interface ArrayProcessor{
    double apply(double[] array);
}

public class Exercise5 {
    public static final ArrayProcessor max =
            arr -> Arrays.stream(arr)
                    .max()
                    .orElseThrow(NoSuchElementException::new);

    public static final ArrayProcessor min =
            arr -> Arrays.stream(arr)
                    .min()
                    .orElseThrow(NoSuchElementException::new);

    public static final ArrayProcessor sum =
            arr -> Arrays.stream(arr)
                    .sum();

    public static ArrayProcessor count(double value) {
            return arr -> Arrays.stream(arr)
                    .filter(index -> index == value)
                    .count();
    }

    public static void main(String[] args) {
        double[] firstList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double[] secondList = { 17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2, 3.14 };
        System.out.println(sum.apply(firstList));
        System.out.println(min.apply(secondList));
        System.out.println(max.apply(firstList));
        System.out.println("Count of 5.0 in first list (should be 1): "
                + count(5.0).apply(firstList) );
    }
}
