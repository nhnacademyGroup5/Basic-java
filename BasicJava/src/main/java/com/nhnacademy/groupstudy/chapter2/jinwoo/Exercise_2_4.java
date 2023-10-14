package com.nhnacademy.groupstudy.chapter2.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_2_4 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("quarters : ");
            int quarters = Integer.parseInt(br.readLine());
            System.out.print("dimes : ");
            int dimes = Integer.parseInt(br.readLine());
            System.out.print("nickles : ");
            int nickles = Integer.parseInt(br.readLine());
            System.out.print("pennies : ");
            int pennies = Integer.parseInt(br.readLine());
            double dollars = (0.25 * quarters) + (0.1 * dimes) + (0.05 * nickles) + (0.01 * pennies);
            System.out.println();
            System.out.println("Converted by Dollar : " + dollars);
        } catch(IOException ioException){
            ioException.getStackTrace();
        }
    }
}
