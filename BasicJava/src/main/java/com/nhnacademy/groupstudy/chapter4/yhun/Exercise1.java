package com.nhnacademy.groupstudy.chapter4.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        printCapitalized(line);

        br.close();
    }

    static void printCapitalized(String line){
        char previousChar = ' ';

        for(int i=0; i<line.length(); i++){
            if (previousChar == ' ')
                System.out.print(Character.toUpperCase(line.charAt(i)));
            else
                System.out.print(line.charAt(i));

            previousChar = line.charAt(i);

        }
    }
}
