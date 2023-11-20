package com.nhnacademy.groupstudy.chapter9.yhun.example;

public class StackE<T> {
     private static class Node<T>{
          T element;
          Node<T> next;
     }
     private Node<T> top;

     public void push(T value){
          Node<T> newNode = new Node<>();
          newNode.element = value;
          newNode.next = top;
          top = newNode;
     }

     public T pop(){
          if(top == null)
               throw new IllegalArgumentException("stack value is null");

          T topElement  = top.element;
          top = top.next;
          return topElement;
     }

     public boolean isEmpty(){
          return top == null;
     }

}
