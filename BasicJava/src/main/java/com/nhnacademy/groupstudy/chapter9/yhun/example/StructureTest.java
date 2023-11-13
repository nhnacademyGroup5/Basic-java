package com.nhnacademy.groupstudy.chapter9.yhun.example;

public class StructureTest {

     public static void main(String[] args) {
          stackTest();
          queueTest();
          treeTest();
     }

     private static void stackTest(){
          StackE<Integer> stack = new StackE<>();
          System.out.println(stack.isEmpty());

          stack.push(1);
          stack.push(2);
          stack.push(34);
          stack.push(4);

          while(!stack.isEmpty()){
               System.out.println(stack.pop());
          }
     }

     private static void queueTest(){
          Queue<String> testQ = new Queue<>();
          System.out.println(testQ.isEmpty());
          testQ.offer("test");
          System.out.println(testQ.peek());
          testQ.offer("test2");
          System.out.println(testQ.size());
          while(!testQ.isEmpty()){
               System.out.println(testQ.poll());
          }
          System.out.println(testQ.size());
     }

     private static void treeTest(){
          BinaryTree tree = new BinaryTree();
          tree.insert(2);
          tree.insert(5);
          tree.insert(1);
          tree.insert(2);
          tree.insert(5);
          tree.treeList(tree.head());

          System.out.println(tree.contains(tree.head(), 1));
          System.out.println(tree.size());

     }
}
