package com.nhnacademy.groupstudy.chapter8.jiwon;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        a = sc.nextDouble();
        System.out.println("Enter b : ");
        b = sc.nextDouble();
        System.out.println("Enter c : ");
        c = sc.nextDouble();
        try {
            System.out.println(rootLogic(a, b, c));
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry, I can't find a solution.");
            System.out.println(e.getMessage());

        }
    }


    static double rootLogic(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("a can not zero");
        } else {
            double disc = (b * b) - (4 * a * c);
            if (disc < 0) {
                throw new IllegalArgumentException("disc < zero");

            }
            return ((-b + Math.sqrt(disc)) / (2 * a));

        }
    }
}
