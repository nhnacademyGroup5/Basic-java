package com.nhnacademy.groupstudy.chapter5.yhun;

import com.nhnacademy.groupstudy.chapter5.yhun.dice.PairOfDice;
import com.nhnacademy.groupstudy.chapter5.yhun.statclac.StatCalcInputShape;
import java.util.ArrayList;
import java.util.List;

public class CombineDiceWithStatCalc {

     static final int LIMIT = 1000000;
     public static void main(String[] args) {
          List<Integer> diceList  = new ArrayList<>();

          for(int i=2; i<13; i++){
               int count = new PairOfDice().diceUntilCount(i, LIMIT);
               diceList.add(count);
          }
          System.out.println(new StatCalcInputShape().statCalcOfArray(diceList));
     }

}
