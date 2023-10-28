package com.nhnacademy.groupstudy.chapter7.yhun.array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.lang.Long.*;

public class ArrayOperator {

     public static void main(String[] args) {
          Arrays.stream(randomFill(10, 10))
                  .forEach(System.out::println);


     }

     public static int[] randomFill(int count, int max){
          return IntStream.iterate(0, i -> i+1)
                  .limit(count)
                  .map(value -> (int) (Math.random() * max) + 1)
                  .toArray();
     }

}
