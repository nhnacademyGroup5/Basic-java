package com.nhnacademy.groupstudy.chapter3.jiwon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Exercise3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] stk = input.split(" ");

        if (stk.length == 3) {
            BigDecimal operand1 = new BigDecimal(stk[0]);
            BigDecimal operand2 = new BigDecimal(stk[2]);

            switch (stk[1]) {
                case "+":
                    System.out.println(operand1.add(operand2));
                    break;
                case "-":
                    System.out.println(operand1.subtract(operand2));
                    break;
                case "*":
                    System.out.println(operand1.multiply(operand2));
                    break;
                case "/":
                    if (!operand2.equals(BigDecimal.ZERO)) {
                        System.out.println(operand1.divide(operand2, 3, BigDecimal.ROUND_HALF_UP));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator: " + stk[1]);
            }
        } else {
            System.out.println("Invalid input format.");
        }

        br.close();
    }
}
