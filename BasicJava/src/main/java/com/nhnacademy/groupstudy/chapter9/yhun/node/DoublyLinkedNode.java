package com.nhnacademy.groupstudy.chapter9.yhun.node;

public interface DoublyLinkedNode<T extends Comparable<T>> extends Comparable<T>{
     T getElement();
     DoublyLinkedNode<T> getLeft();
     DoublyLinkedNode<T> getRight();

     void setElement(T element);
     void setLeft(DoublyLinkedNode<T> left);
     void setRight(DoublyLinkedNode<T> right);
}
