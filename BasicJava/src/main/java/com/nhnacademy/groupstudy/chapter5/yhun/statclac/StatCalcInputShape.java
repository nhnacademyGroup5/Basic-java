package com.nhnacademy.groupstudy.chapter5.yhun.statclac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class StatCalcInputShape {
     public static void main(String[] args){
          new StatCalcInputShape().statCalcOperatorOfInputStream(System.in);
     }

     // 한줄에 실수값 하나씩 표현된 메소드에서만 가능.
     public void statCalcOperatorOfInputStream(InputStream inputStream){
          StatCalc calc = new StatCalc();

          try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))){
               double item = Double.parseDouble(br.readLine());
               while (item != 0){
                    calc.enter(item);
                    item = Double.parseDouble(br.readLine());
               }
               System.out.println(calc);

          }catch (IOException | NumberFormatException exception){
               System.out.println("error");
          }catch (ArithmeticException div){
               System.out.println("error2");
          }
     }

     public StatCalc statCalcOfArray(List<Integer> list){
          StatCalc calc = new StatCalc();
          list.forEach(calc::enter);

          return calc;
     }
}
