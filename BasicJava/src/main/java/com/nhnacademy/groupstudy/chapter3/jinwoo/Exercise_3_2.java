package com.nhnacademy.groupstudy.chapter3.jinwoo;

import java.util.stream.IntStream;

public class Exercise_3_2 {
    public static int numOfDivisor(int num){
        return (int) IntStream.range(1, num + 1)
                .filter(value -> num % value == 0)
                .count();
    }

    public static void maxNumOfDivisor(int input){
        System.out.println("Among integers between 1 and " + input);
        int max = IntStream.range(1, input + 1)
                .map(Exercise_3_2::numOfDivisor)
                .max().orElse(0);
        System.out.println("The maximum number of divisors was " + max);
        IntStream.range(1, input + 1)
            .filter(index -> numOfDivisor(index) == max)
            .forEach(index -> System.out.println("Number with that many divisors is " + index));
    }
    public static void main(String[] args) {
        maxNumOfDivisor(10000);
    }
}
