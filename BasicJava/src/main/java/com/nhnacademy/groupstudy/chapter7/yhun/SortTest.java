package com.nhnacademy.groupstudy.chapter7.yhun;

import com.nhnacademy.groupstudy.chapter7.yhun.sort.ArraySort;
import java.util.Arrays;

public class SortTest {
     public static void main(String[] args) {
          long start = 0;
          long end = 0;
          int[] arr1 = {1 ,4, 2, 1, 23, 45, 22, 3, 0};
          int[] arr2 = {1 ,4, 2, 1, 23, 45, 22, 3, 0};

          for(int i : arr1){
               System.out.print(i + " ");
          }


          start = System.nanoTime();
          ArraySort.selectionSort(arr1);
          end = System.nanoTime();
          // ns > s로 변환
          // 1초 = 1e+9 나노초
          System.out.println((double) (end - start) / 1000000000);

          start = System.nanoTime();
          Arrays.sort(arr2);
          end = System.nanoTime();
          System.out.println((double) (end - start) / 1000000000);
     }
}
