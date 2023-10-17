package com.nhnacademy.groupstudy.chapter4.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void printCapitalize(String input){
        try {
            if (input.matches("^[^a-zA-Z]+$")) {
                throw new IllegalArgumentException("변환할 문자열이 없습니다.");
            }
            System.out.println(input.toUpperCase());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println(input);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            printCapitalize(br.readLine());
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}
