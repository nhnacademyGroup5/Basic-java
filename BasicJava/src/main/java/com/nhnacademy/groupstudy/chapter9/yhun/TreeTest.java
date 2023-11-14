package com.nhnacademy.groupstudy.chapter9.yhun;

import com.nhnacademy.groupstudy.chapter9.yhun.tree.BiTree;

public class TreeTest {
     public static void main(String[] args) {
          BiTree<Integer> tree = new BiTree<>();

          tree.insert(5);
          tree.insert(2);
          tree.insert(3);
          tree.insert(6);
          tree.insert(8);
          tree.insert(7);
          tree.insert(1);
          tree.insert(10);
          tree.insert(9);

//          System.out.println(tree.contains(tree.head(), 6));
//          tree.postOrderPrint(tree.head());
          System.out.println("------------------");
          tree.breadthFirstSearch();

          System.out.println("------------------");
          System.out.println("sumLeafDepth : "+tree.sumLeafDepth(tree.head(), 0));
          System.out.println("maxLeafDepth : "+tree.maxLeafDepth(tree.head(), 0));

     }
}
