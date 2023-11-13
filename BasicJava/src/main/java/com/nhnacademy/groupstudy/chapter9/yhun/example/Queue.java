package com.nhnacademy.groupstudy.chapter9.yhun.example;

public class Queue<T> {
     private static class Node<T>{
          T element;
          Node<T> next;
     }

     private Node<T> head;
     private Node<T> tail;
     private int size;


     public boolean isEmpty(){
          return head == null;
     }

     public int size(){
          return size;
     }

     public T peek(){
          if(head == null)
               throw new IllegalArgumentException("queue is null");

          return head.element;
     }
     public void offer(T element){
          Node<T> newNode = new Node<>();
          newNode.element = element;
          size++;

          if(head == null){
               head = newNode;
               tail = newNode;
               return;
          }

          tail.next = newNode;
          tail = null;

     }

     public T poll(){
          if(head == null)
               throw new IllegalArgumentException("head is null");

          T value = head.element;
          head = head.next;

          if(head == null){
               size = 0;
               tail = null;
          }else size--;

          return value;
     }

}
