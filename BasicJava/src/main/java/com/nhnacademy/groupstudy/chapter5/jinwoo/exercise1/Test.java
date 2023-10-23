package com.nhnacademy.groupstudy.chapter5.jinwoo.exercise1;

import java.util.stream.IntStream;

public class Test {
    public static int diceSum(){
        int dice1 = new PairOfDice().getDice();
        int dice2 = new PairOfDice().getDice();
        return dice1 + dice2;
    }
    public static int countSnakeEyes(){
        return IntStream.iterate(0, i -> i + 1)
                .filter(i -> diceSum() == 2)
                .findFirst()
                .orElseThrow();
    }

    public static void main(String[] args) {
        System.out.println(countSnakeEyes());
    }
}
