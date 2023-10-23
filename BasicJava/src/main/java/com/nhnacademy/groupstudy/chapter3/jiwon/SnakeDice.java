package com.nhnacademy.groupstudy.chapter3.jiwon;

import java.util.stream.Stream;

public class SnakeDice {

    int snakeDice() {
        SnakeRandomDice dice = new SnakeRandomDice();

        return Stream.iterate(0, i -> i + 1)
                .filter(i -> {
                    int diceOne = dice.random();
                    int diceTwo = dice.random();
                    return diceOne == 1 && diceTwo == 1;
                })
                .findFirst()
                .orElseThrow();
    }

    public void print(String message) {
        System.out.println(message);
    }
}
