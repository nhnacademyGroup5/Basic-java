package com.nhnacademy.groupstudy.chapter7.jiwon;

public class RandomNumberGenerators {

    public static class IntegerRandomNumberGenerator implements RandomNumberGenerator<Integer> {
        @Override
        public Integer getRandomNumber(Integer count, Integer max) {
            if (count > max) {
                throw new IllegalArgumentException("Count cannot be greater than max");
            }

            // Your integer random number generation logic
            return (int) (Math.random() * max) + 1;
        }
    }

    public static class DoubleRandomNumberGenerator implements RandomNumberGenerator<Double> {
        @Override
        public Double getRandomNumber(Double count, Double max) {
            if (count > max) {
                throw new IllegalArgumentException("Count cannot be greater than max");
            }

            // Your double random number generation logic
            return Math.random() * max + 1;
        }
    }
}