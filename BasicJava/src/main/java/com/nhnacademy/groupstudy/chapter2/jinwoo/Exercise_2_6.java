package com.nhnacademy.groupstudy.chapter2.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_2_6 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Please enter your first name and last name, separated by a space.");
            String[] arr = br.readLine().split(" ");
            String initials = String.valueOf(arr[0].charAt(0)) + arr[1].charAt(0);
            System.out.println("Your first name is " + arr[0] + ", which has " + arr[0].length() + " characters");
            System.out.println("Your last name is " + arr[1] + ", which has " + arr[1].length() + " characters");
            System.out.println("Your initials are " + initials);

        } catch(IOException e ){
            e.getStackTrace();
        }
    }
}
