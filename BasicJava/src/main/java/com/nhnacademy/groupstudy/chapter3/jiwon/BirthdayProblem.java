package com.nhnacademy.groupstudy.chapter3.jiwon;

public class BirthdayProblem {
    public static void main(String[] args) {

        boolean[] used;
        int count;

        used = new boolean[365];
        count = 0;

        while (true) {
            int birthday = (int) (Math.random() * 365) + 1;
            count++;
            System.out.println(count + " :" + birthday);
            if (used[birthday]) {
                break;
            }
            used[birthday] = true;
        }

        System.out.println(count);
    }
}
