package com.nhnacademy.groupstudy.chapter5.jiwon;

public class QuizCreateQuiz {
    public QuizIntQuestion[] quizCreateQuiz() {
        QuizIntQuestion[] questions = new QuizIntQuestion[10];
        for (int i = 0; i < 10; i++) {
            if (Math.random() < 0.5) {
                questions[i] = new QuizAdditionQuestion();
            } else {
                questions[i] = new QuizSubstractionQuestion();
            }
        }
        return questions;
    }
}
