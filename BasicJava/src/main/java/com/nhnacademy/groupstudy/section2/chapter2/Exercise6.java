package com.nhnacademy.groupstudy.section2.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your first name and last name, separated by a space.");
        String[] name = br.readLine().split(" ");

        System.out.print("Your first name is " + name[0]);
        System.out.println(", Which has " + name[0].length() + " characters");
        System.out.print("Your second name is " + name[1]);
        System.out.println(", Which has " + name[1].length() + " characters");
        System.out.println("Your initials are " + name[0].charAt(0) + name[1].charAt(0));

    }
}
