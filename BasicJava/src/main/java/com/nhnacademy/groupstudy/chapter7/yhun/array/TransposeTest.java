package com.nhnacademy.groupstudy.chapter7.yhun.array;

import com.nhnacademy.groupstudy.chapter7.yhun.array.list.ArrayList;
import com.nhnacademy.groupstudy.chapter7.yhun.array.list.List;
import com.nhnacademy.groupstudy.chapter7.yhun.array.matrix.MatrixOperator;

public class TransposeTest {

     private static final int row = 3;
     private static final int column = 5;
     public static void main(String[] args) {

          List<List<Integer>> list = new ArrayList<>();
          for(int i=0; i<row; i++){
               list.add(new ArrayList<>());
               for(int j=0; j<column; j++){
                    list.get(i).add(i+j);
               }
          }

          System.out.println(" -- MatrixOperator.transpose() before ");
          for(int i=0; i<row; i++){
               System.out.println(list.get(i));
          }

          System.out.println("-- MatrixOperator.transpose() after");
          list = MatrixOperator.transpose(list);
          for(int i=0; i<column; i++){
               System.out.println(list.get(i));
          }

     }
}
