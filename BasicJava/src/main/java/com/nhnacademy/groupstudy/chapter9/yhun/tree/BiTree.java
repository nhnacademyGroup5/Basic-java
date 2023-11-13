package com.nhnacademy.groupstudy.chapter9.yhun.tree;

import com.nhnacademy.groupstudy.chapter9.yhun.node.DoublyLinkedNode;
import java.util.LinkedList;
import java.util.Queue;

public class BiTree<T extends Comparable<T>> {
     private DoublyLinkedNode<T> head = null;
     private int size;

     public DoublyLinkedNode<T> head(){
          return this.head;
     }

     public void insert(T t){
          DoublyLinkedNode<T> createNode = new ParameterTypeNode<>();
          createNode.setElement(t);
          size++;

          if(head == null){
               head = createNode;
               return;
          }

          DoublyLinkedNode<T> runner = head;
          while(true){
               if(createNode.compareTo(t) > 0){
                    if(runner.getLeft() == null){
                         runner.setLeft(createNode);
                         return;
                    }runner = runner.getLeft();
               }else{
                    if(runner.getRight() == null){
                         runner.setRight(createNode);
                         return;
                    }runner = runner.getRight();
               }
          }
     }

     public boolean contains(DoublyLinkedNode<T> rootNode, T value){
          if(rootNode == null) return false;
          if(rootNode.getElement() == value) return true;
          if(value.compareTo(rootNode.getElement()) < 0) contains(rootNode.getLeft(), value);
          return contains(rootNode.getRight(), value);
     }

     public void preOrderPrint(DoublyLinkedNode<T> rootNode){
          if(rootNode != null){
               System.out.println(rootNode.getElement() + " ");
               preOrderPrint(rootNode.getLeft());
               preOrderPrint(rootNode.getRight());
          }
     }

     public void breadthFirstSearch(){
          if(head == null)
               throw new IllegalArgumentException("preOrderPrint : head is null");

          Queue<DoublyLinkedNode<T>> queue = new LinkedList<>();
          DoublyLinkedNode<T> runner = head;

          queue.offer(runner);
          while(!queue.isEmpty()){
               System.out.println(queue.poll().getElement());
               if(runner.getLeft() != null)
                    queue.offer(runner.getLeft());
               if(runner.getRight() != null)
                    queue.offer(runner.getRight());
          }

     }

     public void postOrderPrint(DoublyLinkedNode<T> rootNode){
          if(rootNode != null){
               postOrderPrint(rootNode.getLeft());
               postOrderPrint(rootNode.getRight());
               System.out.println(rootNode.getElement() + " ");
          }
     }

     public void inOrderPrint(DoublyLinkedNode<T> rootNode){
          if(rootNode != null){
               preOrderPrint(rootNode.getLeft());
               System.out.println(rootNode.getElement() + " ");
               preOrderPrint(rootNode.getRight());
          }
     }
}
