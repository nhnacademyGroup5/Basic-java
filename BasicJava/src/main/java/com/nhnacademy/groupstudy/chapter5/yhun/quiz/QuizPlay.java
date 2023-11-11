package com.nhnacademy.groupstudy.chapter5.yhun.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * exception error 명칭을 제대로 파악 하지 못해 IllegalArgumentException 으로 잡았지만
 * exception에 대해 comment 남겨주시면 수정할 수 있도록 하겟습니다.
 * */


public class QuizPlay {

     private List<IntQuestion> quizList;
     private List<Integer> answer;
     private int quizSize;

     private QuizPlay(){
          quizList = new ArrayList<>();
          answer = new ArrayList<>();
     }

     public QuizPlay(int quizSize){
          this();

          if(quizSize < 1)
               throw new IllegalArgumentException("퀴즈를 하기위해 가질수 있는 퀴즈 개수는 최소 1개이상 입니다");

          this.quizSize = quizSize;
     }

     public void initList(boolean otherExample){
          if(quizList == null)
               throw new NullPointerException("null");

          for(int i=0; i<quizSize; i++){
               int rand = (int) (Math.random() * 2);
               if(rand == 0)
                    quizList.add(new AdditionQuestion());
               else if(rand == 1)
                    quizList.add(new SubtractionQuestion());
          }
          if(otherExample){
               otherExample();
          }

          //post-codition
          if(quizList.size() != quizSize)
               throw new IllegalArgumentException("quizList.size() != quizSize");
     }

     public void otherExample(){
          quizSize += 1;
          quizList.add(new IntQuestion() {
                       public String getQuestion() {
                            return "In what year did the First World War begin?";
                       }

                       public int getCorrectAnswer() {
                            return 1914;
                       }
                  }
          );
     }

     public void inputAnswer(){
          if(quizList.isEmpty())
               throw new IllegalArgumentException("List size(0) or memory(null)");

          try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
               for(int i=0; i<quizSize; i++){
                    System.out.print(quizList.get(i).getQuestion());
                    int result = Integer.parseInt(br.readLine());
                    answer.add(result);
               }
          }catch (IOException ioException){
               System.out.println("ioexception error");
          }catch (NumberFormatException numberFormatException){
               System.out.println("NumberFormat Error");
          }

          if(answer.size() != quizSize)
               throw new IllegalArgumentException("answer.size() != quizSize");
     }

     public double scoreAverage(){
          if(answer.isEmpty())
               throw new IllegalArgumentException("quizAnswer size(0) or memory(null)");
          if(quizList.isEmpty())
               throw new IllegalArgumentException("List size(0) or memory(null)");
          if(quizList.size() != answer.size())
               throw new IllegalArgumentException("list, quizAnswer 길이가 달라 불가능");

          int count = 0;
          for(int i=0; i<quizSize; i++){
               if(quizList.get(i).getCorrectAnswer() == answer.get(i))
                    count++;
          }

          // post condition
          // 0 / N 인 경우
          if(count == 0) return 0;
          return ((double) count / quizList.size()) * 100;
     }
}
