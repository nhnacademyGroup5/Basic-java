package com.nhnacademy.groupstudy.chapter9.yhun.example;




class IntegerNode {
     int value;
     IntegerNode left;
     IntegerNode right;
     IntegerNode(int value){
          this.value = value;
     }
}
public class BinaryTree{
     private IntegerNode head = null;
     private int size;

     public IntegerNode head(){
          return head;
     }
     public void insert(int t){
          IntegerNode createNode = new IntegerNode(t);
          size++;
          if(head == null){
               head = createNode;
               return;
          }

          IntegerNode runner = head;
          while(true){
               if(createNode.value <= runner.value){

                    if(runner.left == null){
                         runner.left = createNode;
                         return;
                    }else{
                         runner = runner.left;
                    }
               }else{
                    if(runner.right == null){
                         runner.right = createNode;
                         return;
                    }else{
                         runner = runner.right;
                    }
               }
          }
     }

     public boolean contains(IntegerNode root, int value){
          if(root == null) return false;
          if(value == root.value) return true;
          if(value < root.value) return contains(root.left, value);
          return contains(root.right, value);
     }

     public int size(){
          return this.size;
     }

     public void treeList(IntegerNode root){
          if(root != null){
               treeList(root.left);
               System.out.println(root.value + " ");
               treeList(root.right);
          }
     }


}
