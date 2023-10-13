package com.nhnacademy.groupstudy.chapter2.jiwon;

import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int egg = sc.nextInt();
        int gross = egg / 144;
        int dozen = (egg - gross * 144) / 12;
        int left = egg % 12;

        System.out.println("gross :" + gross + "," + "dozen :" + dozen + "," + "left" + left);


    }
}
