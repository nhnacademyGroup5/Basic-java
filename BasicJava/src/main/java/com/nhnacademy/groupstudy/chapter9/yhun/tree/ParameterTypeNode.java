package com.nhnacademy.groupstudy.chapter9.yhun.tree;

import com.nhnacademy.groupstudy.chapter9.yhun.node.DoublyLinkedNode;

class ParameterTypeNode<T extends Comparable<T>> implements DoublyLinkedNode<T> {

     private T element;
     private DoublyLinkedNode<T> left;
     private DoublyLinkedNode<T> right;


     @Override
     public int compareTo(T o) {
          return element.compareTo(o);
     }

     @Override
     public T getElement() {
          return this.element;
     }

     @Override
     public DoublyLinkedNode<T> getLeft() {
          return this.left;
     }

     @Override
     public DoublyLinkedNode<T> getRight() {
          return this.right;
     }

     public void setElement(T element) {
          this.element = element;
     }

     @Override
     public void setLeft(DoublyLinkedNode<T> left) {
          this.left = left;
     }

     @Override
     public void setRight(DoublyLinkedNode<T> right) {
          this.right = right;
     }
}