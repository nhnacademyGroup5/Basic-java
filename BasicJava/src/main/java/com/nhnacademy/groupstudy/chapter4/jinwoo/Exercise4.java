package com.nhnacademy.groupstudy.chapter4.jinwoo;

import java.util.stream.IntStream;

public class Exercise4 {
    public static double diceSimulate(int num){
        try {
            if (num < 2 || num >= 13) {
                throw new IllegalArgumentException("나올수 없는 경우의 수 입니다. 다시 입력 해주세요.");
            }
            return (double) IntStream.range(1, 10000)
                    .map(n -> Exercise3.countDiceUntilNumber(num))
                    .sum() / 10000;
        } catch(IllegalArgumentException e){
            e.getStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {
        IntStream.range(2, 13).forEach(index -> {
            System.out.println("Total on Dice : " + index);
            System.out.println("Average Number of Rolls : " + diceSimulate(index));
        });
    }
}
