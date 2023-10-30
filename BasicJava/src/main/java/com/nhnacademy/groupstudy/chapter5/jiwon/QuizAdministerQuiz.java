package com.nhnacademy.groupstudy.chapter5.jiwon;

public class QuizAdministerQuiz {
    public int[] quizAdministerQuiz(QuizIntQuestion[] questions) {
        int numQuestions = questions.length;
        int[] userAnswers = new int[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d: %s ", questionNum, questions[i].getQuestion());
            userAnswers[i] = TextIO.getlnInt();
        }
        return userAnswers;
    }
}