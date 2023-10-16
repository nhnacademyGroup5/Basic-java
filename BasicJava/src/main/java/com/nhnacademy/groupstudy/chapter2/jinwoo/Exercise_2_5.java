package com.nhnacademy.groupstudy.chapter2.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_2_5 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("How many eggs do you have? : ");
            int eggs = Integer.parseInt(br.readLine());
            int gross = eggs / 144;
            eggs -= gross * 144;
            int dozen = eggs / 12;
            eggs -= dozen * 12;
            System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozens, and " + eggs);
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}
