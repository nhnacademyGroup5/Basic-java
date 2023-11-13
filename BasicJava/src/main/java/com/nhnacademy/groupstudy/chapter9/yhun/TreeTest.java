package com.nhnacademy.groupstudy.chapter9.yhun;

import com.nhnacademy.groupstudy.chapter9.yhun.tree.BiTree;

public class TreeTest {
     public static void main(String[] args) {
          BiTree<String> tree = new BiTree<>();

          tree.insert("123");
          System.out.println(tree.contains(tree.head(), "123"));
          System.out.println(tree.contains(tree.head(), "23"));

          tree.insert("234");
          tree.insert("567");

          System.out.println(tree.contains(tree.head(), "567"));
          tree.postOrderPrint(tree.head());

          tree.breadthFirstSearch();
     }
}
