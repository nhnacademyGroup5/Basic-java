package com.nhnacademy.groupstudy.chapter9.yhun.parser;

public class OperatorNode implements Node{
     private char oper;
     private Node left;
     private Node right;

     public OperatorNode(char oper, Node left, Node right){
          this.oper = oper;
          this.left = left;
          this.right = right;
     }

     @Override
     public double value(double value){
          double x = left.value(value);
          double y = right.value(value);

          switch(this.oper){
               case '+':
                    return x + y;
               case '-':
                    return x - y;
               case '/':
                    if(x == 0) throw new ArithmeticException("div 0");
                    return x / y;
               case '*':
                    return x * y;
               default:
                    return Double.NaN;
          }
     }

     @Override
     public void printStackCommands(){
          this.left.printStackCommands();
          this.right.printStackCommands();
          System.out.println("  Operator : " + oper);
     }
}
