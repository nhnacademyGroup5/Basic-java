package com.nhnacademy.groupstudy.chapter5.yhun;

public class Exercise3 {

     static final int LIMIT = 10000;
     public static void main(String[] args) {

          StatCalc cal = new StatCalc();

          for(int i=2; i<13; i++){
               int count = new PairOfDice().diceUntilCount(i, LIMIT);
               cal.enter(count);
          }
          System.out.println(cal);
     }

}
