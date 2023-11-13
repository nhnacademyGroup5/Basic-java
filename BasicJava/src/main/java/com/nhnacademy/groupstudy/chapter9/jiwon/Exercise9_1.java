package com.nhnacademy.groupstudy.chapter9.jiwon;

import static com.example.demo.chapter9.Exercise9_1Logic.factorial;
import static com.example.demo.chapter9.Exercise9_1Logic.fibonacci;
import static com.example.demo.chapter9.Exercise9_1Logic.fibonacci_nonrecursive;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = new BigInteger(sc.nextLine());

        BigInteger result_fibonacci = fibonacci(N);
        BigInteger result_fibonacci_non = fibonacci_nonrecursive(N);
        BigInteger result_factorial = factorial(N);

        System.out.println(result_fibonacci);
        System.out.println(result_fibonacci_non);
        System.out.println(result_factorial);


    }
}
