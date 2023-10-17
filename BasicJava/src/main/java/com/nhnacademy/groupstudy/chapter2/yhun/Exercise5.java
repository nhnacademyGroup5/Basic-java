package com.nhnacademy.groupstudy.chapter2.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {

    private static final int STANDARD = 12;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int egg = Integer.parseInt(br.readLine());



        int gross = division(egg, (int)Math.pow(STANDARD, 2));
//                egg / (int)Math.pow(STANDARD, 2);
        egg = remainder(egg, (int)Math.pow(STANDARD, 2));
//                (int)Math.pow(STANDARD, 2);

        int dozen = division(egg, STANDARD);
//                egg / STANDARD;
        int mod = remainder(egg, STANDARD);
                //                egg % STANDARD;

        System.out.println("Your number of eggs is " + gross + " gross ," + dozen + ", and " + mod);

    }

    static int division(int value, int denominator){
        if(denominator == 0)
            throw new IllegalArgumentException("error");

        return value/denominator;
    }

    static int remainder(int value, int denominator){
        if(denominator == 0)
            throw new IllegalArgumentException("error");

        return value%denominator;
    }

}
