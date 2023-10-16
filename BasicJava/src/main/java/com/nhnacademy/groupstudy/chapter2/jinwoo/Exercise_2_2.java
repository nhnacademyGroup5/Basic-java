package com.nhnacademy.groupstudy.chapter2.jinwoo;

public class Exercise_2_2 {
    static int dice(){
        return (int) (Math.random() * 6 + 1);
    }
    public static void main(String[] args) {
        int first = dice();
        int second = dice();
        System.out.println("The first die comes up " + first);
        System.out.println("The second die comes up " + second);
        System.out.println("Your total roll is " + (first + second));
    }
}
