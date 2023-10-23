package com.nhnacademy.groupstudy.chapter4.jiwon;

public class AdditionQuizGrade {


    public int gradeAdditionQuiz(int[] firstNumbers, int[] secondNumbers, int[] userAnswers) {
        int correctAnswers = 0;

        for (int i = 0; i < firstNumbers.length; i++) {
            int index = i + 1;
            int answer = firstNumbers[i] + secondNumbers[i];

            System.out.print(index + ". " + firstNumbers[i] + " + " + secondNumbers[i] + " = " +
                    userAnswers[i] + " - ");
            if (userAnswers[i] == answer) {
                System.out.println("Correct");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answer);
            }
        }

        return correctAnswers;
    }
}