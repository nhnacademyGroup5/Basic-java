package com.nhnacademy.groupstudy.chapter8.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Equation {

     public static void main(String[] args) throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = null;
          double a, b, c;
          double result;
          boolean loop = true;

          while (loop){
               System.out.println("Ax^2 + Bx + C 방정식의 해를 구할수 있도록" );
               System.out.println("A B C 형태로 값을 넣어주세요." );

               st = new StringTokenizer(br.readLine());

               a = Double.parseDouble(st.nextToken());
               b = Double.parseDouble(st.nextToken());
               c = Double.parseDouble(st.nextToken());

               try {
                    result = quadratic(a, b, c);
                    System.out.println("result : " + result);
               }catch (IllegalArgumentException e){
                    e.printStackTrace();
               }

               System.out.println("계속? y/n");
               loop = br.readLine().toUpperCase().charAt(0) == 'Y';
          }
     }

     public static double quadratic( double A, double B, double C )
             throws IllegalArgumentException {
          if (A == 0) {
               throw new IllegalArgumentException("A can't be zero.");
          }
          else {
               double disc = B*B - 4*A*C;
               if (disc < 0)
                    throw new IllegalArgumentException("Discriminant < zero.");
               return  (-B + Math.sqrt(disc)) / (2*A);
          }
     }

}
