package com.nhnacademy.groupstudy.chapter9.yhun.parser;

public class UnaryMinusNode implements Node{
     private Node operand;

     public UnaryMinusNode(Node operand){
          this.operand = operand;
     }

     @Override
     public double value(double x){
          return -operand.value(x);
     }

     @Override
     public void printStackCommands(){
          operand.printStackCommands();
          System.out.println(" Unary minus");
     }
}
