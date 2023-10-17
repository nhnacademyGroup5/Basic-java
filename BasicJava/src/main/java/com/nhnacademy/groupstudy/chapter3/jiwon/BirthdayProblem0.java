package com.nhnacademy.groupstudy.chapter3.jiwon;

public class BirthdayProblem0 {
    public static void main(String[] args) {


        int[] used = new int[365];
        int count = 0;
        int fir = 0;
        int sec = 0;
        int thr = 0;
        while (count < 365) {
            int birthday = (int) (Math.random() * 365);
            count++;

            used[birthday]++;

            if (used[birthday] == 3) {
                thr++;
            }
            if (used[birthday] == 2) {
                sec++;
            }

            if (used[birthday] == 1) {
                fir++;
            }
        }
        System.out.println(fir + " " + sec + " " + thr);


    }
}
