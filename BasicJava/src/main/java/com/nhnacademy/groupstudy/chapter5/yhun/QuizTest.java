package com.nhnacademy.groupstudy.chapter5.yhun;

import com.nhnacademy.groupstudy.chapter5.yhun.quiz.QuizPlay;

public class QuizTest {

     public static void main(String[] args) {
          System.out.println(quizRunAndReturnAverage());
     }

     public static double quizRunAndReturnAverage(){
          QuizPlay paly = new QuizPlay(1);
          paly.initList(true);
          paly.inputAnswer();
          return paly.scoreAverage();
     }
}
