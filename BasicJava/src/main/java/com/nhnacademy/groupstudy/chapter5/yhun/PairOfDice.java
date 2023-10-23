package com.nhnacademy.groupstudy.chapter5.yhun;

public class PairOfDice {
     private int dice1;
     private int dice2;

     PairOfDice() {
          roll();
     }

     public void roll() {
          this.dice1 = (int) (Math.random() * 6) + 1;
          this.dice2 = (int) (Math.random() * 6) + 1;
     }

     public int getDice1() {
          return dice1;
     }

     public int getDice2() {
          return dice2;
     }

     public int sumDice() {
          return dice1 + dice2;
     }

     public int diceUntilCount(int sumCondition, int limit) {
          if (sumCondition < 2 || sumCondition > 12) {
               throw new IllegalArgumentException("condition error");
          }
          if (limit < 0) {
               throw new IllegalArgumentException("limit minimum is negative integer");
          }

          int count = 0;
          for (int i = 0; i < limit; i++) {
               roll();
               if (sumCondition == sumDice()) {
                    count++;
               }
          }
          return count;
     }

     @Override
     public String toString() {
          return "dice 1 = " + dice1 + ", dice 2 = " + dice2;
     }
}
