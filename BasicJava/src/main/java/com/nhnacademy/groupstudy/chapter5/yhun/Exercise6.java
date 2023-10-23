package com.nhnacademy.groupstudy.chapter5.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exercise6 {

     public static void main(String[] args) {
          List<AdditionQuestion> list = new ArrayList<>();
          List<Integer> quizAnswer = new ArrayList<>();

          initList(list, 10);
          inputAnswer(list, quizAnswer);
          System.out.println(scoreAverage(list, quizAnswer));
     }

     public static void initList(List<AdditionQuestion> list, int count){
          for(int i=0; i<count; i++){
               list.add(new AdditionQuestion());
          }
     }

     public static void inputAnswer(List<AdditionQuestion> list,  List<Integer> quizAnswer){
          if(list.isEmpty())
               throw new IllegalArgumentException("List size(0) or memory(null)");

          try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
               for(int i=0; i<list.size(); i++){
                    System.out.print(list.get(i).getQuestion());
                    int result = Integer.parseInt(br.readLine());
                    quizAnswer.add(result);
               }
          }catch (IOException ioException){
               System.out.println("ioexception error");
          }catch (NumberFormatException numberFormatException){
               System.out.println("NumberFormat Error");
          }
     }

     public static double scoreAverage(List<AdditionQuestion> list,  List<Integer> quizAnswer){
          if(quizAnswer.isEmpty())
               throw new IllegalArgumentException("quizAnswer size(0) or memory(null)");
          if(list.isEmpty())
               throw new IllegalArgumentException("List size(0) or memory(null)");
          if(list.size() != quizAnswer.size())
               throw new IllegalArgumentException("list, quizAnswer 길이가 달라 불가능");

          int count = 0;
          for(int i=0; i<list.size(); i++){
               if(list.get(i).getCorrectAnswer() == quizAnswer.get(i))
                    count++;
          }

          if(count == 0) return 0;
          return ((double) count / list.size()) * 100;
     }

}
