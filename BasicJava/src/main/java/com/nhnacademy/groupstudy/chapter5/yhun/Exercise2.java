package com.nhnacademy.groupstudy.chapter5.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
     public static void main(String[] args) {
          StatCalc calc = new StatCalc();

          try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

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
}
