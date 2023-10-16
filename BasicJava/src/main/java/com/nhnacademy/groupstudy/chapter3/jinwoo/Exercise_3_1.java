package com.nhnacademy.groupstudy.chapter3.jinwoo;

public class Exercise_3_1 {
    public static void main(String[] args) {
        int count = 0;
        while(true){
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            System.out.println(count  + "회차 시도 [" + dice1 + ", " + dice2 + "]");
            if(dice1 == 1 && dice2 == 1) break;
            count++;
        }
        System.out.println(count);
    }
}
