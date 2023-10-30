package com.nhnacademy.groupstudy.chapter7.yhun.array.sort;

public class ArraySort {
     public static void main(String[] args) {

     }

     private static void swap(int[] array, int x, int y){
          int temp = array[x];
          array[x] = array[y];
          array[y] = temp;
     }

     public static void bubbleSort(int[] array){
          for(int i=0; i<array.length; i++){
               for(int j=0; j< array.length-1; j++){
                    if(array[i] < array[j])
                         swap(array, i, j);
               }
          }
     }
}
