package com.nhnacademy.groupstudy.chapter3.jiwon;


import java.util.Comparator;
import java.util.stream.Stream;

public class DivisorMax {
    int divisorMax(int n) {

        Divisor divisor = new Divisor();
        return Stream.iterate(1, i -> i + 1)
                .limit(n)
                .max(Comparator.comparingInt(divisor::divisors))
                .orElse(1);
    }

    public void print(String message) {
        System.out.println(message);
    }

}