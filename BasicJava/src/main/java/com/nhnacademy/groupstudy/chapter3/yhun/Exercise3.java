package com.nhnacademy.groupstudy.chapter3.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String[] oper = br.readLine().split(" ");
            if(oper[0].equals("0")) break;

            double x = 0;
            double y = 0;

            try {
                x = Double.parseDouble(oper[0]);
                y = Double.parseDouble(oper[2]);
            }catch (NumberFormatException e){
                System.out.println("입력은 숫자만 가능합니다");
                continue;
            }

            switch (oper[1]){
                case "+":
                    System.out.printf("%f + %f = %f\n", x, y, x+y);
                    break;
                case "-":
                    System.out.printf("%f - %f = %f\n", x, y, x-y);
                    break;
                case "/":
                    try {
                        System.out.printf("%f / %f = %f\n", x, y, x/y);
                    }catch (ArithmeticException e){
                        System.out.println("분모 0은 연산이 되지 않음");
                    }
                    break;
                case "*":
                    System.out.printf("%f * %f = %f\n", x, y, x*y);
                    break;
                default:
                    System.out.println("+, -, *, /를 제외한 연산은 작동하지 않음");
            }
        }
    }

}
