package com.nhnacademy.groupstudy.chapter9.yhun.parser;

public class VariableNode implements Node{
     public VariableNode(){}

     @Override
     public double value(double x){
          return x;
     }

     @Override
     public void printStackCommands(){
          System.out.println("  Push X");
     }
}
