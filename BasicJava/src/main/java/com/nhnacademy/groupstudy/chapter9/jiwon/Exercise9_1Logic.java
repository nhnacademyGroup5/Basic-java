package com.nhnacademy.groupstudy.chapter9.jiwon;


import java.math.BigInteger;


public class Exercise9_1Logic {


    static BigInteger fibonacci(BigInteger N) {
        if (N.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("N must be non-negative");
        }
        if (N.equals(BigInteger.ZERO) || N.equals(BigInteger.ONE)) {
            return N;
        } else {
            return fibonacci(N.subtract(BigInteger.ONE)).add(
                    fibonacci(N.subtract(new BigInteger("2"))));
        }
    }


    static BigInteger fibonacci_nonrecursive(BigInteger N) {
        if (N.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("N must be non-negative");
        }
        if (N.equals(BigInteger.ZERO) || N.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            BigInteger f0 = BigInteger.ONE;
            BigInteger f1 = BigInteger.ONE;
            for (int i = 2; i < N.intValue(); i++) {
                BigInteger fi = f0.add(f1);
                f0 = f1;
                f1 = fi;
            }
            return f1;
        }
    }


    static BigInteger factorial(BigInteger N) {
        if (N.signum() < 0) {
            throw new IllegalArgumentException("N > 0");
        }
        if (N.equals(BigInteger.ZERO)) {

            return BigInteger.ONE;
        } else {
            BigInteger factorialOfNMinus1 = factorial(N.subtract(BigInteger.ONE));
            return N.multiply(factorialOfNMinus1);
        }
    }

}


