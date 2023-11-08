package com.nhnacademy.groupstudy.chapter8.yhun.expr;

import com.nhnacademy.groupstudy.basicjava.TextIO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExprTest {

     public static void main(String[] args)  throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          String line = "";
          String x = "";
          Expr expr = null;


          while(true){
               System.out.println("f(x)를 정의");
               System.out.print("restart(input/f(x)), exit(enter)");
               line = br.readLine();
               if(line.isEmpty()) break;

               try{
                    expr = new Expr(line);
               }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    System.out.print("재입력 : ");
               }

               while (true){
                    System.out.println("x 값");
                    System.out.println("restart(input/x), exit(enter)");
                    x = br.readLine();
                    if(x.isEmpty()) break;

                    double value = 0;
                    double var = 0;

                    try{
                         value = Double.parseDouble(x);
                    }catch (NumberFormatException e){
                         System.out.println(e.getMessage());
                         System.out.print("숫자 입력 : ");
                    }

                    var = expr.value(value);
                    if(Double.isNaN(var))
                         System.out.println("f(" + x + ") is undefined.");
                    else
                         System.out.println("f(" + x + ") = " + var);

               }
          }
     }

}
