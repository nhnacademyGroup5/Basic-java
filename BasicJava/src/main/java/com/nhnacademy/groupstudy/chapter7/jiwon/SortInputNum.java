package com.nhnacademy.groupstudy.chapter7.jiwon;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;

public class SortInputNum {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        DoubleStream randomStream = DoubleStream.generate(new Random()::nextDouble)
                .limit(numbers.length).sorted();

        double[] randomNumbers = randomStream.toArray();


        System.out.println(Arrays.toString(randomNumbers));
    }
}
