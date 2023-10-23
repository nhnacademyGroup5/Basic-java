package com.nhnacademy.groupstudy.chapter5.jinwoo;

import static com.nhnacademy.groupstudy.chapter5.jinwoo.exercise1.Test.diceSum;

import com.nhnacademy.groupstudy.chapter5.jinwoo.exercise2.StatCalc;
import java.util.stream.IntStream;

public class Excercise3 {
    public static void main(String[] args) {
        IntStream.rangeClosed(2, 12)
                .forEach(index -> {
                    StatCalc statCalc = new StatCalc();
                    int roll = diceSum();
                    while(roll != index){
                        statCalc.enter(roll);
                        roll = diceSum();
                    }
                    System.out.println("Case : " + index);
                    System.out.println("Dice Total : " + statCalc.getCount());
                    System.out.println("Avg # of Rolls : " + statCalc.getMean());
                    System.out.println("Stand. Deviation : " + statCalc.getStandardDeviation());
                    System.out.println("Max # of Rolls : " + statCalc.getMax());
                    System.out.println("-------------------------------------------");
        });
    }
}
