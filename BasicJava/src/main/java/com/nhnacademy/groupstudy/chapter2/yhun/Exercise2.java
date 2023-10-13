package com.nhnacademy.groupstudy.chapter2.yhun;

public class Exercise2 {

    public static void main(String[] args) {

        int first;
        int second;

        first = (int) (Math.random() * 6) + 1;
        second = (int) (Math.random() * 6) + 1;

        System.out.println("The first die comes up " + first);
        System.out.println("The second die comes up " + second);
        System.out.println("Your total roll is " + (first + second));

    }

}
