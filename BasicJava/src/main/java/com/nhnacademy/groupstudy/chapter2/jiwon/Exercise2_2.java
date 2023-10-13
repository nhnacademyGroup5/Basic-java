package com.nhnacademy.groupstudy.chapter2.jiwon;

public class Exercise2_2 {
    public static void main(String[] args) {
        int firstDice = (int) (Math.random() * 6) + 1;
        int secondDice = (int) (Math.random() * 6) + 1;
        System.out.println(firstDice);
        System.out.println(secondDice);
        System.out.println("Your total roll : " + (firstDice + secondDice));

    }
}
