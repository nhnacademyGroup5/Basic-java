package com.nhnacademy.groupstudy.chapter4.jiwon;

import java.util.Arrays;
import java.util.List;

public class DiceSum {
    DiceRandom diceRandom = new DiceRandom();

    void diceSum(int n) {
        try {

            if (n < 2 || n > 12) {
                throw new IllegalArgumentException();

            }
            Integer sum = 0;
            int count = 0;
            int index = 0;
            while (count < 10000) {
                int dice1 = diceRandom.random();
                int dice2 = diceRandom.random();
                List<Integer> integers = Arrays.asList(dice1, dice2);
                sum = integers.stream().reduce(0, Integer::sum);

                index++;


                if (sum == n) {

                    count++;
                }
            }

            System.out.println("평균 굴림수" + (double) (index / count));
            System.out.println("반복횟수: " + index);
        } catch (IllegalArgumentException e) {
            e.getMessage();
            System.out.println("error");

        }

    }

}
