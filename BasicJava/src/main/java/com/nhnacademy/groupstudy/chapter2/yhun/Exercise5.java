package com.nhnacademy.groupstudy.chapter2.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int egg = Integer.parseInt(br.readLine());


        int gross = egg / 144;
        egg %= 144;

        int dozen = egg / 12;
        int mod = egg % 12;

        System.out.println("Your number of eggs is " + gross + " gross ," + dozen + ", and " + mod);

    }

}
