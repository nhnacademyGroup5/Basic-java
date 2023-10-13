package com.nhnacademy.groupstudy.chapter2.jiwon;

import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollars;
        int dimes = sc.nextInt();
        int nickels = sc.nextInt();
        int pennies = sc.nextInt();

        dollars = (0.1 * dimes) + (0.05 * nickels) + (0.01 * pennies);
        System.out.println(dollars);


    }


}
