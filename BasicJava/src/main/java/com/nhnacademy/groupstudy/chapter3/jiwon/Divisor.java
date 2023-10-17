package com.nhnacademy.groupstudy.chapter3.jiwon;

import java.util.stream.Stream;

public class Divisor {
    int divisors(int n) {
        return (int) Stream.iterate(1, i -> i + 1)
                .limit(n)
                .filter(i -> n % i == 0).count();
    }
}
