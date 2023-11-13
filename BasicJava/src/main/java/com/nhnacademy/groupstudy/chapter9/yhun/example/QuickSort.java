package com.nhnacademy.groupstudy.chapter9.yhun.example;

import java.util.Arrays;

public class QuickSort {

     public static void main(String[] args) {
          int[] testArray = {19,8,7,52,21,23,41,23,12,31,1,2,3,4,5,7};

          leftPivotSort(testArray, 0, testArray.length-1);

          Arrays.stream(testArray).forEach(System.out::println);
     }


     public static void leftPivotSort(int[] array, int low, int high){
          if(low >= high)
               return;

          int pivot = partition(array, low, high);

          leftPivotSort(array, low, pivot-1);
          leftPivotSort(array, pivot+1, high);
     }

     private static int partition(int[] array, int left, int right){
          int low = left;
          int high = right;
          int pivot = array[left];

          while(low < high){
               while (array[high] > pivot && low < high){
                    high--;
               }

               while(array[low] <= pivot && low < high){
                    low++;
               }

               swap(array, low, high);
          }

          swap(array, left, low);
          return low;
     }

     private static void swap(int[] array, int x, int y){
          int temp = array[x];
          array[x] = y;
          array[y] = temp;
     }

}
