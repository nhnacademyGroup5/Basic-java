package com.nhnacademy.groupstudy.chapter4.jinwoo;

import static com.nhnacademy.groupstudy.chapter3.jinwoo.Exercise_3_1.diceResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    public static void diceUntilNumber(int num){
        System.out.println("Start");
        if (num < 2 || num >= 13) {
            throw new IllegalArgumentException("나올수 없는 경우의 수 입니다. 다시 입력 해주세요.");
        }
        int count = 0;
        int result;
        do {
            count++;
            result = diceResult();
            System.out.println(count + "회차");
            System.out.println("Result : " + result);
        }
        while(result != num);
        System.out.println("End");
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            diceUntilNumber(Integer.parseInt(br.readLine()));
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}
