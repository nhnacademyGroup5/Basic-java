package com.nhnacademy.groupstudy.chapter7.yhun.array;

import com.nhnacademy.groupstudy.chapter7.yhun.array.sort.ArraySort;

public class SortTest {
     public static void main(String[] args) {


          int[] arr = {1 ,4, 2, 1, 23, 45, 22, 3, 0};
          for(int i : arr){
               System.out.print(i + " ");
          }

          System.out.println();
          ArraySort.bubbleSort(arr);
          for(int i=0; i<arr.length; i++){
               System.out.print(arr[i] + " ");
          }
     }
}
