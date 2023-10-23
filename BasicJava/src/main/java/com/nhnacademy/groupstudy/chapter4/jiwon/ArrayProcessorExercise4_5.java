package com.nhnacademy.groupstudy.chapter4.jiwon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayProcessorExercise4_5 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(Arrays.asList(1.0, 2.5, 4.3, 3.2, 5.0));
        System.out.println(list.stream().mapToDouble(i -> i).max().orElse(0.0));
        System.out.println(list.stream().min(Comparator.comparing(x -> x)).orElseThrow());
        System.out.println(list.stream().mapToDouble(i -> i).sum());
        System.out.println(list.stream().mapToDouble(i -> i).average().orElse(-1.0));

    }
}
