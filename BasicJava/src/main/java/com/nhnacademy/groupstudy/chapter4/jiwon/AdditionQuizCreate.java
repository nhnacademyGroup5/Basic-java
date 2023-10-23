package com.nhnacademy.groupstudy.chapter4.jiwon;

import java.util.Random;
import java.util.Scanner;

public class AdditionQuizCreate {
    Scanner sc = new Scanner(System.in);
    AdditionQuizGrade quizGrader = new AdditionQuizGrade();

    public void createAdditionQuiz(int[] firstNumbers, int[] secondNumbers) {
        Random random = new Random();
        int[] userAnswers = new int[firstNumbers.length];
        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] = random.nextInt(100); // Generates a random number between 0 and 99
            secondNumbers[i] = random.nextInt(100);
            System.out.println((i + 1) + ". " + firstNumbers[i] + " + " + secondNumbers[i] + " = "
            );
            System.out.println("Please enter the answer :");
            userAnswers[i] = sc.nextInt();
        }

        int score = quizGrader.gradeAdditionQuiz(firstNumbers, secondNumbers, userAnswers);
        System.out.println("score : " + score);
    }
}