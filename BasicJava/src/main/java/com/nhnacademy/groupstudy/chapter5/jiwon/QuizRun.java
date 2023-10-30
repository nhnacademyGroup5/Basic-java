package com.nhnacademy.groupstudy.chapter5.jiwon;

public class QuizRun {
    public static void quizRun() {
        QuizCreateQuiz quizCreateQuiz = new QuizCreateQuiz();
        QuizAdministerQuiz quizAdministerQuiz = new QuizAdministerQuiz();
        QuizGradeQuiz quizGradeQuiz = new QuizGradeQuiz();

        QuizIntQuestion[] questions = quizCreateQuiz.quizCreateQuiz();
        int[] userAnswers = quizAdministerQuiz.quizAdministerQuiz(questions);

        quizGradeQuiz.quizGradeQuiz(questions, userAnswers);
    }
}

