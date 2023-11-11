package com.nhnacademy.groupstudy.chapter7.yhun.sort;

public class ArraySort {
     public static void main(String[] args) {

     }

     private static void swap(int[] array, int x, int y){
          int temp = array[x];
          array[x] = array[y];
          array[y] = temp;
     }

     // O(n^2)
     public static void bubbleSort(int[] arr){
          for(int i=0; i<arr.length; i++){
               for(int j=0; j< arr.length-i-1; j++){
                    if (arr[j] > arr[j+1])
                         swap (arr, j+1, j);
               }
          }
     }

     //O(n^2)
     public static void insertSort(int[] arr){
          for(int i=1; i<arr.length; i++){
               int temp = arr[i];
               int j = i-1;

               for(; j>=0 && temp<arr[j]; j--){
                    arr[j+1] = arr[j];
               }arr[j+1] = temp;

          }
     }

     public static void reverseInsertSort(double arr[], int size){
          if(size <= 0)
               throw new NullPointerException("arr is null");

          for(int i=size-2; i>=0; i--){
               double temp = arr[i];
               int j = i+1;
               for(; j<size && temp<arr[j]; j++){
                    arr[j-1] = arr[j];
               }arr[j-1] = temp;

          }
     }

     // O(n^2)
     public static void selectionSort(int[] arr){
          for(int i=0; i<arr.length-1; i++){
               int index = i;
               for(int j=i+1; j<arr.length; j++){
                    if(arr[index] > arr[j])
                         index = j;
               }
               swap(arr, i, index);

          }
     }
}
