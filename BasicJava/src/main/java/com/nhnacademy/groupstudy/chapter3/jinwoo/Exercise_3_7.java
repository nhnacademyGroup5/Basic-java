package com.nhnacademy.groupstudy.chapter3.jinwoo;

public class Exercise_3_7 {

    public static void checkCountDuplicate() {

    }

    public static void main(String[] args) {
        int[] birthdayArr = new int[365];
        for (int i = 0; i < 365; i++) {
            birthdayArr[i] = (int) (Math.random() * 365 + 1);
        }

    }
}
