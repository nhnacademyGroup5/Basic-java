package com.nhnacademy.groupstudy.chapter3.jiwon;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DivisorMaxList {

    void divisorMaxList(int n) {
        Divisor divisor = new Divisor();
        List<Integer> divisors = Stream.iterate(1, i -> i + 1)
                .limit(n)
                .sorted((a, b) -> Integer.compare(divisor.divisors(b), divisor.divisors(a)))
                .collect(Collectors.toList());

        int maxDivisor = divisors.get(0);
        int secondMaxDivisor = divisors.get(1);

        print("Number with the most divisors: " + maxDivisor);
        print("Number with the second most divisors: " + secondMaxDivisor);
        print(divisor.divisors(maxDivisor));
    }

    void print(String message) {
        System.out.println(message);
    }

    void print(int number) {
        System.out.println(number);
    }


}
