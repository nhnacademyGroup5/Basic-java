package com.nhnacademy.groupstudy.chapter4.jiwon;

public class AddtionQuizExercise {
    public static void main(String[] args) {

        int[] firstNumbers = new int[10];
        int[] secondNumbers = new int[10];


        AdditionQuizCreate quizCreator = new AdditionQuizCreate();
        quizCreator.createAdditionQuiz(firstNumbers, secondNumbers);

    }
}





