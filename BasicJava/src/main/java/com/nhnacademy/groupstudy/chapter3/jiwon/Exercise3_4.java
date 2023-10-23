package com.nhnacademy.groupstudy.chapter3.jiwon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_4 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] words = s.split("[^a-zA-Z]+");

        for (String word : words) {
            System.out.println(word);
        }

        br.close();

    }
}
