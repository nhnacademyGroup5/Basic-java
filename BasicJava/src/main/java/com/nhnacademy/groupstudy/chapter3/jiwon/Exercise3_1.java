package com.nhnacademy.groupstudy.chapter3.jiwon;

import java.util.stream.Stream;

public class Exercise3_1 {
    public static void main(String[] args) {

        int count = Stream.iterate(0, i -> i + 1)
                .filter(i -> {
                    int diceOne = (int) (Math.random() * 6) + 1;
                    int diceTwo = (int) (Math.random() * 6) + 1;
                    return diceOne == 1 && diceTwo == 1;
                })
                .findFirst().orElseThrow(); // Handle the case where no match is found

        System.out.println(count);
//        int count = 0;
//
//        while (true) {
//            int diceOne = (int) (Math.random() * 6) + 1;
//            int diceTwo = (int) (Math.random() * 6) + 1;
//            count++;
//
//            if (diceOne == 1 && diceTwo == 1) {
//                break;
//            }
//        }
//        System.out.println("count " + count);
    }
}
