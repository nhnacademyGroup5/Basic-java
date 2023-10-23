package com.nhnacademy.groupstudy.chapter4.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void printCapitalize(String input){

    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            printCapitalize(br.readLine());
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}
