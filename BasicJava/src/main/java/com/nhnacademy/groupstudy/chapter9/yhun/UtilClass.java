package com.nhnacademy.groupstudy.chapter9.yhun;

import java.math.BigInteger;
import java.util.Stack;

public class UtilClass {
     public static void main(String[] args) {
          System.out.println(fibonacci(3));
          System.out.println(factorial(BigInteger.valueOf(100)));

          Stack<Integer> test = new Stack<>();
          test.push(1);
          test.push(2);
          test.push(3);
          test.push(4);
          test.push(5);

          test.remove(2);

          System.out.println(test);

     }

     public static BigInteger fibonacci(int value){
          if(value < 0)
               throw new IllegalArgumentException("value is negative integer");

          if(value <= 1)
               return BigInteger.valueOf(value);

          BigInteger f0 = BigInteger.ZERO;
          BigInteger f1 = BigInteger.ONE;
          for (int i = 2; i <= value; i++) {
               BigInteger fi = f0.add(f1);
               f0 = f1;
               f1 = fi;
          }
          return f1;
     }

     public static BigInteger factorial(BigInteger N){
          if(N == null){
               throw new IllegalArgumentException("N is null");
          }

          if(N.equals(BigInteger.ONE))
               return BigInteger.ONE;

          return N.multiply(factorial(N.subtract(BigInteger.ONE)));
     }

}
