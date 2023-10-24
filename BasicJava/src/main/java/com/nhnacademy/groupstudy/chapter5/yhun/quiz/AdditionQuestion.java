package com.nhnacademy.groupstudy.chapter5.yhun.quiz;

public class AdditionQuestion implements IntQuestion{

     private int a;
     private int b;  // The numbers in the problem.

     public AdditionQuestion() { // constructor
          a = (int)(Math.random() * 50 + 1);
          b = (int)(Math.random() * 50);
     }

     public String getQuestion() {
          return "What is " + a + " + " + b + " ?";
     }

     public int getCorrectAnswer() {
          return a + b;
     }

}
