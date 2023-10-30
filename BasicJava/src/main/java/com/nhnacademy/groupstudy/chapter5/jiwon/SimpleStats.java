package com.nhnacademy.groupstudy.chapter5.jiwon;

import java.util.Scanner;

public class SimpleStats {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StatCalc statCalc = new StatCalc();
        double item;

        System.out.println("Enter your numbers.  Enter 0 to end.");
        System.out.println();

        do {
            System.out.print("? ");
            item = in.nextDouble();
            if (item != 0) {
                statCalc.enter(item);
            }
        } while (item != 0);

        System.out.println("\nStatistics about your data:\n");
        System.out.println("   Count:              " + statCalc.getCount());
        System.out.println("   Sum:                " + statCalc.getSum());
        System.out.println("   Minimum:            " + statCalc.getMin());
        System.out.println("   Maximum:            " + statCalc.getMax());
        System.out.println("   Average:            " + statCalc.getMean());
        System.out.println("   Standard Deviation: "
                + statCalc.getStandardDeviation());

    }

}
