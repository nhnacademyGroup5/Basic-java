package com.nhnacademy.groupstudy.chapter9.yhun;

import com.nhnacademy.groupstudy.chapter9.yhun.list.SingleLinkedList;

public class ListTest {

     public static void main(String[] args) {
          SingleLinkedList<String> list = new SingleLinkedList<>();
          list.insert("123");
          list.insert("123");
          list.insert("123");
          list.insert("123");
          list.print();

          System.out.println("-------------");
          SingleLinkedList<String> reverseList = list.reverse();
          reverseList.print();

     }

}
