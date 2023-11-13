package com.nhnacademy.groupstudy.chapter9.yhun.example;

public class PracticeClass {

     public static void main(String[] args) {

          int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
          System.out.println(binarySearch(arr, 0, arr.length-1, 8));
     }

     private static int binarySearch(int[] array, int left, int right, int searchValue){
          if(array == null)
               throw new IllegalArgumentException("Array null Exception error");

          if(left > right) return -1;

          int mid = (left + right) / 2;


          if(array[mid] < searchValue)
               return binarySearch(array, mid+1, right, searchValue);
          else if(array[mid] > searchValue)
               return binarySearch(array, left, mid-1, searchValue);

          return array[mid];
     }
}
