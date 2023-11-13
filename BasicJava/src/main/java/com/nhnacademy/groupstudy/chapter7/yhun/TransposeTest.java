package com.nhnacademy.groupstudy.chapter7.yhun;

import com.nhnacademy.groupstudy.chapter7.yhun.list.ArrayList;
import com.nhnacademy.groupstudy.chapter7.yhun.list.List;
import com.nhnacademy.groupstudy.chapter7.yhun.matrix.MatrixOperator;
import java.util.Scanner;

public class TransposeTest {

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int row = scanner.nextInt();
          int column = scanner.nextInt();

          List<List<Integer>> list = madeList(row, column);

          System.out.println(" -- MatrixOperator.transpose() before ");
          listPrint(list, row);

          System.out.println("-- MatrixOperator.transpose() after");
          list = MatrixOperator.transpose(list);

          listPrint(list, column);
     }
     public static void listPrint(List<List<Integer>> list, int number){
          for (int i = 0; i < number; i++) {
               System.out.println(list.get(i));
          }
     }
     public static List<List<Integer>> madeList(int row, int column){
          List<List<Integer>> list = new ArrayList<>();
          for(int i=0; i<row; i++){
               list.add(new ArrayList<>());
               for(int j=0; j<column; j++){
                    list.get(i).add(i+j);
               }
          }
          return list;
     }
}
