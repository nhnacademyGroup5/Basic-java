package com.nhnacademy.groupstudy.chapter7.jiwon;

import java.text.DecimalFormat;

public class Exercise7_1 {
    public static void main(String[] args) {
        RandomNumberGenerator<Integer> integerGenerator =
                new RandomNumberGenerators.IntegerRandomNumberGenerator();
        RandomNumberGenerator<Double> doubleGenerator =
                new RandomNumberGenerators.DoubleRandomNumberGenerator();

        Exercise7_1Random<Integer> exercise71Random1 = new Exercise7_1Random<>(integerGenerator);
        int count = 10;
        int max = 100;
        System.out.println(count + " integers chosen from the range 1 to " + max + ":");
        System.out.print('(');
        for (int i = 0; i < count; i++) {
            System.out.print(exercise71Random1.getRandomNumber(count, max));
            System.out.print(" ");
        }
        System.out.println(")");

        Exercise7_1Random<Double> exercise71Random = new Exercise7_1Random<>(doubleGenerator);
        double count2 = 10;
        double max2 = 100; // Change max to a double value
        System.out.println(count2 + " doubles chosen from the range 1.0 to " + max2 + ":");

        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        for (int i = 0; i < count; i++) {
            double randomDouble = exercise71Random.getRandomNumber(count2, max2);
            System.out.println(decimalFormat.format(randomDouble));
        }
    }
}