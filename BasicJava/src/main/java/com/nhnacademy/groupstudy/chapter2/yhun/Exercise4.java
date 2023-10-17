package com.nhnacademy.groupstudy.chapter2.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.UnaryOperator;

public class Exercise4 {

    private static int dollar = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dollar = Integer.parseInt(br.readLine());

        int penny = convert(value -> value * 100, dollar);
        int nickel = convert(value -> value / 5, penny);
        int dime = convert(value -> value / 10, penny);
        int quarter = convert(value -> value / 25, penny);

        print(penny, "penny");
        print(nickel, "nickel");
        print(dime, "dime");
        print(quarter, "quarter");

    }

    static <T extends Number> void print(T result, String unit){
        System.out.println(dollar + " dollar to " + unit + " : " + result);
    }

    static <T extends Number> T convert(UnaryOperator<T> oper, T money){
        return oper.apply(money);
    }
}
