package com.nhnacademy.groupstudy.chapter2.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_2_3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("What's your name ? : ");
            String name = br.readLine();
            System.out.println("Hello, " + name + ", nice to meet you!");
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}
