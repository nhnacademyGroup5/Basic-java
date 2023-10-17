package com.nhnacademy.groupstudy.chapter2.yhun;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Exercise2 {

    public static void main(String[] args) {

        int first;
        int second;

        first = (int) (Math.random() * 6) + 1;
        second = (int) (Math.random() * 6) + 1;

        System.out.println("The first die comes up " + first);
        System.out.println("The second die comes up " + second);

        int sum = sum((x, y) -> x+y, first, second);
        System.out.println("Your total roll is " + sum);

    }

    static <T extends Number> T sum(BinaryOperator<T> binaryOperator, T t, T init){
        return binaryOperator.apply(t, init);
    }


}
