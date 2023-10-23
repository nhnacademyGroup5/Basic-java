package com.nhnacademy.groupstudy.chapter5.jiwon;

public class QuizAdditionQuestion implements QuizIntQuestion {

    private int firstNum, secondNum;

    public QuizAdditionQuestion() {
        firstNum = (int) (Math.random() * 100);
        secondNum = (int) (Math.random() * 100);
    }

    @Override
    public String getQuestion() {
        return firstNum + " + " + secondNum + " =";
    }

    @Override
    public int getCorrectAnswer() {
        return firstNum + secondNum;
    }
}
