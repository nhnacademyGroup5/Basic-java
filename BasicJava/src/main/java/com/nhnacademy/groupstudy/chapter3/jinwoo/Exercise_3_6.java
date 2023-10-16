package com.nhnacademy.groupstudy.chapter3.jinwoo;

public class Exercise_3_6 {

    public static int numOfDivisor(int index){
        int count = 0;
        for (int i = 1; i <= index; i++) {
            if(index % i == 0) count++;
        }
        return count;
    }
    public static void maxNumOfDivisor(int range){
        int max = 0;
        for (int num = 1; num <= range; num++) {
            max = Math.max(max, numOfDivisor(num));
        }
        System.out.println("Among integers between 1 and " + range);
        System.out.println("The maximum number of divisors was " + max);
        numsOfMaxNumDivisors(range, max);
    }

    public static void numsOfMaxNumDivisors(int range, int num){
        System.out.println("Numbers with that many divisors include:");
        for (int i = 1; i < range; i++) {
            if (numOfDivisor(i) == num) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        maxNumOfDivisor(10000);
    }
}
