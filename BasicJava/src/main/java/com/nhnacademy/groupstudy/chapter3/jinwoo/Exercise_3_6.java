package com.nhnacademy.groupstudy.chapter3.jinwoo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise_3_6 {

    public static int numOfDivisor(int index){
        return (int) IntStream.rangeClosed(1, index)
                .filter(i -> index % i == 0)
                .count();
    }
    public static void maxNumOfDivisor(int range){
        int max = IntStream.rangeClosed(1, range)
                .map(Exercise_3_6::numOfDivisor)
                .max()
                .orElseThrow();
        System.out.println("Among integers between 1 and " + range);
        System.out.println("The maximum number of divisors was " + max);
        numsOfMaxNumDivisors(range, max);
    }

    public static void numsOfMaxNumDivisors(int range, int max){
        System.out.println("Numbers with that many divisors include:");
        IntStream.range(1, range + 1)
                .filter(index -> numOfDivisor(index) == max)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        maxNumOfDivisor(10000);
    }
}
