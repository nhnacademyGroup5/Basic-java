package com.nhnacademy.groupstudy.chapter4.jinwoo;

import static com.nhnacademy.groupstudy.chapter3.jinwoo.Exercise_3_1.diceResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {

    public static int countDiceUntilNumber(int num){
        try {
            if (num < 2 || num >= 13) {
                throw new IllegalArgumentException("나올수 없는 경우의 수 입니다. 다시 입력 해주세요.");
            }
            int count = 0;
            int result;
            do {
                count++;
                result = diceResult();
            }
            while(result != num);
            return count;
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(countDiceUntilNumber(Integer.parseInt(br.readLine())));
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}
