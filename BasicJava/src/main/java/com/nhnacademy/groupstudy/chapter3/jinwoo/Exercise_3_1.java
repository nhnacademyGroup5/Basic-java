package com.nhnacademy.groupstudy.chapter3.jinwoo;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise_3_1 {
    private static final Random random = new Random();
    public static int diceRoll(){
        return random.nextInt(6) + 1;
    }

    public static int diceResult(){
        return IntStream.of(diceRoll(), diceRoll())
                .sum();
    }

    // Snake Eyes가 나올때 까지의 주사위 결과를 더하는 메소드
    public static int sumDiceResult(){
        return IntStream.iterate(0, i -> i + 1)
                .map(i -> diceResult())
                .takeWhile(result -> result != 2)
                .sum();
    }

    public static int countSnakeEyes(){
        return IntStream.iterate(0, i -> i + 1)
                .filter(i -> diceResult() == 2)
                .findFirst()
                .orElseThrow();
    }

    public static void main(String[] args) {
        System.out.println(countSnakeEyes());
        System.out.println(sumDiceResult());
    }
}
