package com.nhnacademy.groupstudy.chapter3.jiwon;

import java.util.stream.Stream;

public class Exercise3_2 {


    public static void main(String[] args) {
        int maxDivisor = Stream.iterate(1, i -> i + 1).limit(10000)
                .max((a, b) -> Integer.compare(divisor(a), divisor(b))).orElse(1);

        System.out.println(divisor(maxDivisor));
        System.out.println(maxDivisor);

    }


    private static int divisor(int n) {
        return (int) Stream.iterate(1, i -> i + 1).limit(n)
                .filter(i -> n % i == 0).count();
    }

}


