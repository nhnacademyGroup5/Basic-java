package com.nhnacademy.groupstudy.chapter3.jinwoo;

import com.nhnacademy.groupstudy.basicjava.TextIO;

public class Exercise_3_3 {
    static double operation(double x, char operator, double y){
        switch (operator){
            case '+' : return x + y;
            case '-' : return x - y;
            case '*' : return x * y;
            case '/' : {
                if (y == 0) throw new IllegalArgumentException("분모에 0이 들어갈 수 없습니다.");
                return x / y;
            }
            default: return 0;
        }
    }

    public static void main(String[] args) {
        while(true){
            double first = TextIO.getDouble();
            if(first == 0) {
                break;
            }
            char operator = TextIO.getChar();
            double second = TextIO.getDouble();
            System.out.println(first + " " + operator + " " + second + " = " + operation(first, operator, second));
        }
        System.exit(0);
    }
}
