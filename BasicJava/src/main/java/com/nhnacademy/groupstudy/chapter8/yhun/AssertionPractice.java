package com.nhnacademy.groupstudy.chapter8.yhun;


/**
 *   assert statement forms:
 *   1. assert condition;
 *   2. assert condition : error-message;
 * */
public class AssertionPractice {

     public static void main(String[] args) {
          System.out.println(root(1, 2, 6));
     }
     static public double root( double A, double B, double C )  {
          assert A != 0 : "Leading coefficient of quadratic equation cannot be zero.";
          double disc = B*B - 4*A*C;
          assert disc >= 0 : "Discriminant of quadratic equation cannot be negative.";
          return  (-B + Math.sqrt(disc)) / (2*A);
     }


}
