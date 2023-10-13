package com.nhnacademy.groupstudy.section2.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.UnaryOperator;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dollar = Integer.parseInt(br.readLine());

        int penny = convert(value -> value * 100, dollar);
        int nickel = convert(value -> value / 5, penny);
        int dime = convert(value -> value / 10, penny);
        int quarter = convert(value -> value / 25, penny);

        System.out.println(dollar + " dollar > penny : " + penny);
        System.out.println(dollar + " dollar > nickel : " + nickel);
        System.out.println(dollar + " dollar > dime : " + dime);
        System.out.println(dollar + " dollar > quarter : " + quarter);

    }

    static <T extends Number> T convert(UnaryOperator<T> oper, T money){
        return oper.apply(money);
    }
}
