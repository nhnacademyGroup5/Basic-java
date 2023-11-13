package com.nhnacademy.groupstudy.chapter9.jinwoo;

import java.math.BigInteger;

public class Mathx {
    public static BigInteger fibonacci(int input){
        if(input < 0) throw new IllegalArgumentException("Fibonacci : Illegal input");
        if(input == 0) return BigInteger.ZERO;
        return input == 1 ? BigInteger.ONE : fibonacci(input -1).add(fibonacci(input - 2));
    }

    public static BigInteger factorial(int input){
        if(input < 0) throw new IllegalArgumentException("Factorial : Illegal input");
        return input == 0 ? BigInteger.ONE : BigInteger.valueOf(input).multiply(factorial(input - 1));
    }

    public static void main(String[] args) {
        System.out.println(factorial(15));
        System.out.println(fibonacci(40));
    }
}
