package com.nhnacademy.groupstudy.chapter3.yhun;

import java.util.ArrayList;
import java.util.List;

/**
 * 연습 문제 2번 + 6번 문제
 * */

public class Exercise2 {
    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();
        int max = 1;
        int idx = 2;

        while (idx <= 10000){

            int count = 2;
            for(int i=2; i<=Math.sqrt(idx); i++){
                if(idx % i == 0){
                    if(idx/i == i) count++;
                    else count+=2;
                }
            }

            if(max < count){
                max = count;
                if(!result.isEmpty())
                    result.clear();

                result.add(idx);
            }else if(max == count){
                result.add(idx);
            }
            idx++;
        }
        System.out.println("Among integers between 1 and 10000,");
        System.out.println("The maximum number of divisors was " + max);
        System.out.println("Numbers with that many divisors include : ");
        result.forEach(System.out::println);
    }
}
