package com.nhnacademy.groupstudy.chapter4.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int diceNumber = Integer.parseInt(br.readLine());
            System.out.println("simulate result : " + diceSimulate(diceNumber));

            System.out.println("ave : " + rollAverage(10000));

        }catch (IllegalArgumentException e){

            // NumberFormatException 는 IllegalArgumentException 를 포함하여
            // parseInt()에 대한 NumberFormatException 을 해결.
            System.out.println(e.getMessage());
        }

        br.close();
    }

    static int diceSimulate(int twoDice){

        if(twoDice < 2 || twoDice > 12)
            throw new IllegalArgumentException("argument error");

        int count = 0;
        while (true){
            int dice1 = (int)(Math.random()*6) + 1;
            int dice2 = (int)(Math.random()*6) + 1;
            count++;

            if(dice1+dice2 == twoDice)
                return count;
        }

    }

    static double rollAverage(int idx){
        int total = 0;

        for(int i=0; i<idx; i++){
            int dice = (int)(Math.random() * 10) + 2;
            total += diceSimulate(dice);
        }

        return total / (double)idx;
    }

}
