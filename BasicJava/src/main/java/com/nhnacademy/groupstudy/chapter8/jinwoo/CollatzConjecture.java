package com.nhnacademy.groupstudy.chapter8.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CollatzConjecture {
    private static final BigInteger ONE = BigInteger.ONE;
    private static final BigInteger TWO = BigInteger.TWO;
    private static final BigInteger THREE = BigInteger.valueOf(3L);
    private BigInteger input;

    private CollatzConjecture(BigInteger input){
        this.input = input;
    }

    public static CollatzConjecture valueOf(String input){
        return new CollatzConjecture(new BigInteger(input));
    }

    public static CollatzConjecture valueOf() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Input : ");
            String input = br.readLine();
            return new CollatzConjecture(new BigInteger(input));
        } catch(NumberFormatException e){
            System.out.println("CollatzConjecture : Illegal input");
            return valueOf();
        }
    }

    public int count(){
        int result = 0;
        while(!input.equals(ONE)){
            if(input.testBit(0)){
                input = input.multiply(THREE);
                input = input.add(ONE);
            } else {
                input = input.divide(TWO);
            }
            result++;
        }
        return result;
    }
}
