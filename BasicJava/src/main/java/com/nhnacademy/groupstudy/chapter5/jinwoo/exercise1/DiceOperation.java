package com.nhnacademy.groupstudy.chapter5.jinwoo.exercise1;

import java.util.stream.IntStream;

public class DiceOperation{
    public static int diceSum(){
        int dice1 = new Dice().getDice();
        int dice2 = new Dice().getDice();
        return dice1 + dice2;
    }
    public static int countSnakeEyes(){
        return IntStream.iterate(0, i -> i + 1)
                .filter(i -> diceSum() == 2)
                .findFirst()
                .orElseThrow();
    }
}
