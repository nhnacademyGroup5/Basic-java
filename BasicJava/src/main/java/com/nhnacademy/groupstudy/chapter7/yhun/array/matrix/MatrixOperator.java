package com.nhnacademy.groupstudy.chapter7.yhun.array.matrix;

import com.nhnacademy.groupstudy.chapter7.yhun.array.list.ArrayList;
import com.nhnacademy.groupstudy.chapter7.yhun.array.list.List;

public class MatrixOperator {
     public static <T> List<List<T>> transpose(List<List<T>> list){
          int row = list.size();
          int columns = list.get(0).size();

          List<List<T>> temp = new ArrayList<>();
          for(int i=0; i<columns; i++){
               temp.add(new ArrayList<>());
               for(int j=0; j<row; j++){
                    temp.get(i).add(list.get(j).get(i));
               }
          }

          return temp;
     }
}
