package com.nhnacademy.groupstudy.chapter9.yhun.node;

public interface SingleLinkedNode<T extends Comparable<T>> extends Comparable<T>{
     T getElement();
     void setElement(T element);

     SingleLinkedNode<T> getNext();
     void setNext(SingleLinkedNode<T> next);
}
