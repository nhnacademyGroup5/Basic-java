package com.nhnacademy.groupstudy.chapter5.jiwon;

public class PairOfDiceExercise5_1 {
    private static PairOfDice pairOfDice = new PairOfDice();

    public static void main(String[] args) {
        int count = 0;

        do {
            pairOfDice.roll();
            count++;
        } while (pairOfDice.getTotal() != 6);

        System.out.println(count);
        System.out.println(pairOfDice);
    }
}
