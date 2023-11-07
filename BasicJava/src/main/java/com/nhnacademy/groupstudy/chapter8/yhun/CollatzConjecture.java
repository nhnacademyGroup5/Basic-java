package com.nhnacademy.groupstudy.chapter8.yhun;

import java.math.BigInteger;

public class CollatzConjecture {

     static final BigInteger THREE = BigInteger.valueOf(3);

     public static void main(String[] args) {
          collatz(BigInteger.valueOf(27), 0);
     }

     static void collatz(BigInteger value, int count)  {
          assert value != null && value.signum() == 1;

          System.out.println("BigInteger value : " + value);
          if(value.equals(BigInteger.ONE)){
               System.out.println("Count : " + count);
               return;
          }

          if(!value.testBit(0)){
               collatz(value.divide(BigInteger.TWO), count+1);
          }else{
               collatz(value.multiply(THREE).add(BigInteger.ONE), count+1);
          }
     }
}
