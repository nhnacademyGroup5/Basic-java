package com.nhnacademy.groupstudy.chapter5.jinwoo.exercise1;

import java.util.Random;

public class PairOfDice {
    private final Random random = new Random();
    private final int dice = random.nextInt(6) + 1;

    public int getDice() {
        return dice;
    }

    @Override
    public String toString() {
        return "Dice value : " + dice;
    }
}
