package com.nhnacademy.groupstudy.chapter3.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise_3_4 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] arr = br.readLine().replaceAll("[^\\w\\s]", " ").split("\\s+");
            Arrays.stream(arr).forEach(System.out::println);
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}
