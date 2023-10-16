package com.nhnacademy.groupstudy.chapter3.jinwoo;

public class Exercise_3_2 {
    public static void maxNumOfDivisor(int input){
        int maxNum = 1;
        int max = 0;
        for (int num = 1; num <= input; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if(num % i == 0) count++;
            }
            if(max != Math.max(max, count)) maxNum = num;
            max = Math.max(max, count);
        }
        System.out.println("Among integers between 1 and " + input);
        System.out.println("The maximum number of divisors was " + max);
        System.out.println("Numbers with that many divisors : " + maxNum);
    }
    public static void main(String[] args) {
        maxNumOfDivisor(10000);
    }
}
