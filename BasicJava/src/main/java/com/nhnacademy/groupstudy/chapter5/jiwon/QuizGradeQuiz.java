package com.nhnacademy.groupstudy.chapter5.jiwon;

public class QuizGradeQuiz {

    void quizGradeQuiz(QuizIntQuestion[] questions, int[] userAnswers) {
        System.out.println();
        System.out.println("Here are the correct answers:");
        System.out.println();
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++) {
            System.out.println("Question number " + (i + 1) + ":");
            System.out.println("    " + questions[i].getQuestion());
            System.out.println("    Correct answer:  " + questions[i].getCorrectAnswer());
            if (userAnswers[i] == questions[i].getCorrectAnswer()) {
                System.out.println("    You were CORRECT.");
                numberCorrect++;
            } else {
                System.out.println("    You said " + userAnswers[i] + ", which is INCORRECT.");
            }
            System.out.println();
        }
        grade = numberCorrect * 10;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }
}
