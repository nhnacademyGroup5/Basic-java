package com.nhnacademy.groupstudy.chapter9.yhun.list;

import com.nhnacademy.groupstudy.chapter9.yhun.node.SingleLinkedNode;

public class SingleParameterTypeNode<T extends Comparable<T>> implements SingleLinkedNode<T> {

     private T element;
     private SingleLinkedNode<T> next;


     @Override
     public T getElement() {
          return this.element;
     }

     @Override
     public void setElement(T element) {
          this.element = element;
     }

     @Override
     public SingleLinkedNode<T> getNext() {
          return this.next;
     }

     @Override
     public void setNext(SingleLinkedNode<T> next) {
          this.next = next;
     }

     @Override
     public int compareTo(T o) {
          return this.element.compareTo(o);
     }
}
