package com.nhnacademy.groupstudy.chapter2.jiwon;

import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int space;
        String firstName;
        String lastName;
        input = sc.nextLine();
        space = input.indexOf(" ");
        firstName = input.substring(0, space);
        lastName = input.substring(space + 1);
        System.out.println(firstName);
        System.out.println(lastName);


    }
}
