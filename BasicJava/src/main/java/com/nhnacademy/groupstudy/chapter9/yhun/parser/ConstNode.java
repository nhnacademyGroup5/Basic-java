package com.nhnacademy.groupstudy.chapter9.yhun.parser;

public class ConstNode implements Node{
     private double number;

     public  ConstNode(double value){
          this.number = number;
     }

     @Override
     public double value(double xValue){
          return this.number;
     }

     @Override
     public void printStackCommands(){
          System.out.println(" PUSH " + number);
     }
}
