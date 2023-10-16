package com.nhnacademy.groupstudy.chapter3.jiwon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise3_6 {
    public static void main(String[] args) {
        List<Integer> divisors = Stream.iterate(1, i -> i + 1)
                .limit(10000)
                .sorted(Comparator.comparingInt(Exercise3_6::divisor).reversed())
                .collect(Collectors.toList());

        int maxDivisor = divisors.get(0);
        int secondMaxDivisor = divisors.get(1);

        System.out.println("Number with the most divisors: " + maxDivisor);
        System.out.println("Number with the second most divisors: " + secondMaxDivisor);
    }

    private static int divisor(int n) {
        return (int) Stream.iterate(1, i -> i + 1).limit(n)
                .filter(i -> n % i == 0)
                .count();
    }

}
