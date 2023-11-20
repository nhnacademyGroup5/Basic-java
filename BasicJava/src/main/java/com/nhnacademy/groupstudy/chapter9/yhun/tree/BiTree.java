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

          if(head == null){
               head = createNode;
               return;
          }

          DoublyLinkedNode<T> runner = head;
          while(true){
               if(runner.compareTo(t) > 0){
                    if(runner.getLeft() == null){
                         runner.setLeft(createNode);
                         return;
                    }runner = runner.getLeft();
                    System.out.print("left ");
               }else{
                    if(runner.getRight() == null){
                         runner.setRight(createNode);
                         return;
                    }runner = runner.getRight();
                    System.out.print("right ");
               }
               System.out.println();
          }
     }

     public boolean contains(DoublyLinkedNode<T> rootNode, T value){
          if(rootNode == null) return false;
          if(rootNode.getElement() == value) return true;
          if(value.compareTo(rootNode.getElement()) > 0) contains(rootNode.getLeft(), value);
          return contains(rootNode.getRight(), value);
     }

     public void preOrderPrint(DoublyLinkedNode<T> rootNode){
          if(rootNode != null){
               System.out.println(rootNode.getElement() + " ");
               preOrderPrint(rootNode.getLeft());
               preOrderPrint(rootNode.getRight());
          }
     }


     // DFS
     public int sumLeafDepth(DoublyLinkedNode<T> root, int depth){
          if(root == null) return 0;

          if(root.getRight() == null && root.getLeft() == null)
               return depth;

          return sumLeafDepth(root.getLeft(), depth+1) +
                  sumLeafDepth(root.getRight(), depth+1);
     }

     public int maxLeafDepth(DoublyLinkedNode<T> root, int depth){
          if(root == null) return 0;

          if(root.getLeft() == null && root.getRight() == null)
               return depth;

          return Math.max(maxLeafDepth(root.getRight(), depth+1),
                  maxLeafDepth(root.getLeft(), depth+1));
     }

     //BFS
     public void breadthFirstSearch(){
          if(head == null)
               throw new IllegalArgumentException("preOrderPrint : head is null");

          DoublyLinkedNode<T> root = head;
          Queue<DoublyLinkedNode<T>> queue = new LinkedList<>();
          queue.offer(root);
          while(!queue.isEmpty()){
               DoublyLinkedNode<T> node = queue.poll();

               System.out.println(node.getElement() + " ");
               if(node.getLeft() != null)
                    queue.offer(node.getLeft());
               if(node.getRight() != null)
                    queue.offer(node.getRight());
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
