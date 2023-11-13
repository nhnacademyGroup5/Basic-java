package com.nhnacademy.groupstudy.chapter9.yhun.list;

import com.nhnacademy.groupstudy.chapter9.yhun.node.SingleLinkedNode;

public class SingleLinkedList<T extends Comparable<T>>{
     private SingleLinkedNode<T> head = null;
     private int size = 0;

     public SingleLinkedNode<T> getHead() {
          return head;
     }

     public void setHead(SingleLinkedNode<T> head) {
          this.head = head;
     }

     public void insert(T value){

          SingleLinkedNode<T> createNode = new SingleParameterTypeNode<>();
          createNode.setElement(value);
          size++;

          if(head == null){
               head = createNode;
               return;
          }

          SingleLinkedNode<T> runner = head;
          while (runner.getNext() != null){
               runner = runner.getNext();
          }

          runner.setNext(createNode);
     }

     public SingleLinkedList<T> reverse(){
          if(head == null)
               throw new IllegalArgumentException("head is null");

          SingleLinkedList<T> temp = new SingleLinkedList<>();
          SingleLinkedNode<T> runner = head;
          SingleLinkedNode<T> node = null;

          while (runner != null){

               SingleLinkedNode<T> createNode = new SingleParameterTypeNode<>();
               createNode.setElement(runner.getElement());
               createNode.setNext(node);

               node = createNode;
               runner = runner.getNext();
          }
          temp.setHead(node);
          return temp;
     }

     public void print(){
          SingleLinkedNode<T> runner = head;
          int len = this.length(runner);
          for(int i=0; i<len; i++){
               System.out.println(runner.getElement());
               runner = runner.getNext();
          }
     }

     public int length(SingleLinkedNode<T> node){
          if(node == null) return 0;
          return 1 + length(node.getNext());
     }
}
