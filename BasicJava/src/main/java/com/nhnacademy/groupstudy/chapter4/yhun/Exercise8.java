package com.nhnacademy.groupstudy.chapter4.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise8 {

    static final int arraySize = 10;
    static int[] oper1 = new int[arraySize];
    static int[] oper2 = new int[arraySize];
    static int[] answer = new int[arraySize];

    public static void main(String[] args) throws IOException{

        createOper(arraySize-1);
        userAnswer();
        int sum = quizAverage(10);
        System.out.println("Quiz의 결과는 "+ sum + " 입니다.");
    }

    static void createOper(int arrayLength){
        if(0 > arrayLength) return;

        oper1[arrayLength] = (int)(Math.random()*100) + 1;
        oper2[arrayLength] = (int)(Math.random()*100) + 1;
        createOper(arrayLength-1);
    }

    static void userAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("간단한 더하기 퀴즈.");

        for(int i=0; i<arraySize; i++){
            System.out.printf("%d + %d = ", oper1[i], oper2[i]);

            int sum = oper1[i] + oper2[i];
            answer[i] = Integer.parseInt(br.readLine());


            if(sum != answer[i]){
                System.out.println("오답");
            }else{
                System.out.println("정답");
            }
        }

        br.close();
    }

    static int quizAverage(int score){
        int sum = 0;
        for(int i=0; i<arraySize; i++){
            if(oper1[i]+oper2[i] == answer[i]){
                sum += score;
            }
        }

        return sum;
    }
}
