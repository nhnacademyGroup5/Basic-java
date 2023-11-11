package com.nhnacademy.groupstudy.chapter8.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Expr expression;
        String line;
        double x;
        double val;
        while(true){
            System.out.println("Enter expression or return to quit");
            System.out.print("f(x) = ");
            line = br.readLine();
            if(line.isEmpty()) break;
            try {
                expression = new Expr(line);
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Press return to end.");

            while(true){
                System.out.print("x = ");
                line = br.readLine();
                if(line.isEmpty()) break;
                try {
                    x = Double.parseDouble(line);
                } catch(NumberFormatException e){
                    System.out.println(line + " is not a number");
                    continue;
                }
                val = expression.value(x);
                if (Double.isNaN(val))
                    System.out.println("f(" + x + ") is undefined.");
                else
                    System.out.println("f(" + x + ") = " + val);
            }
        }
        System.out.println("End");
    }
}
