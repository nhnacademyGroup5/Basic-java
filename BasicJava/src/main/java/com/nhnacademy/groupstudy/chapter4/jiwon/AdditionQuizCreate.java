package com.nhnacademy.groupstudy.chapter4.jiwon;

import java.util.Random;

public class AdditionQuizCreate {

    public void createAdditionQuiz(int[] firstNumbers, int[] secondNumbers) {
        Random random = new Random();

        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] = random.nextInt(100); // Generates a random number between 0 and 99
            secondNumbers[i] = random.nextInt(100);
            System.out.println((i + 1) + ". " + firstNumbers[i] + " + " + secondNumbers[i] + " = "
            );
        }
    }
}