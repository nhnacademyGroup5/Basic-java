package com.nhnacademy.groupstudy.chapter4.jiwon;

import java.util.Scanner;

public class AddtionQuizExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstNumbers = new int[10];
        int[] secondNumbers = new int[10];
        int[] userAnswers = new int[10];

        AdditionQuizCreate quizCreator = new AdditionQuizCreate();
        AdditionQuizGrade quizGrader = new AdditionQuizGrade();

        quizCreator.createAdditionQuiz(firstNumbers, secondNumbers);

        for (int i = 0; i < firstNumbers.length; i++) {
            System.out.println("Please enter the answer :");
            userAnswers[i] = sc.nextInt();

        }

        int score = quizGrader.gradeAdditionQuiz(firstNumbers, secondNumbers, userAnswers);
        System.out.println("score : " + score);
    }
}





