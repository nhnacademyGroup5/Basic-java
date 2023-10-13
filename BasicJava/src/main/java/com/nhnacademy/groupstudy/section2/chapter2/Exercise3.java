package com.nhnacademy.groupstudy.section2.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();

        System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you");

    }
}
