package com.nhnacademy.groupstudy.chapter4.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
    public static int valueOfHexaDecimal(char index){
        return valueOfHexaDecimal((int) index);
    }
    public static int valueOfHexaDecimal(int index){
        try {
            if (!String.valueOf(index).matches("^[0-9A-Fa-f]+$")) {
                throw new IllegalArgumentException("변환 할 수 없습니다.");
            }
            if(index >=65 && index <= 70){
                return index - 55;
            }
            if(index >= 97 && index <= 102)
                return index - 87;
            return index - 48;
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return -1;
        }
    }
    public static long hexaDecimalToDecimal(String input){
        try {
            if (!input.matches("^[0-9A-Fa-f]+$")) {
                throw new IllegalArgumentException("변환 할 수 없습니다.");
            }
            return input.chars()
                    .map(Exercise2::valueOfHexaDecimal)
                    .reduce(0, (x,y) -> x * 16 + y);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(hexaDecimalToDecimal(br.readLine()));
            System.out.println(valueOfHexaDecimal('2'));
            System.out.println(valueOfHexaDecimal('A'));
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}
