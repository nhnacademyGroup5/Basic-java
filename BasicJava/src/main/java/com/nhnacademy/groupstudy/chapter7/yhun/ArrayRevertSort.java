package com.nhnacademy.groupstudy.chapter7.yhun;

import com.nhnacademy.groupstudy.chapter7.yhun.sort.ArraySort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRevertSort {

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          double[] arr = new double[100];
          int size = 0;

          while (true){
               double input = Double.parseDouble(br.readLine());
               if(input <= 0) break;

               arr[size++] = input;
          }

          ArraySort.reverseInsertSort(arr, size);
          for(int i=0; i<size; i++){
               System.out.print(arr[i] + " ");
          }

     }
}
