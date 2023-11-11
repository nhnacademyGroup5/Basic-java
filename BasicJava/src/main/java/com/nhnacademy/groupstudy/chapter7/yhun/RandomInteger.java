package com.nhnacademy.groupstudy.chapter7.yhun;

import com.nhnacademy.groupstudy.chapter7.yhun.list.ArrayList;
import com.nhnacademy.groupstudy.chapter7.yhun.list.List;

public class RandomInteger {
     private static final List<Integer> list = new ArrayList<>();

     public static void main(String[] args) {
          randomIntsOfArrayRange(10, 100);
          System.out.println(list);
     }

     public static void randomIntsOfArrayRange(int randomRange, int arraySize){
          for(int i=0; i<arraySize; i++){
               list.add((int) (Math.random() * randomRange));
          }
     }

}
