package com.nhnacademy.groupstudy.chapter9.yhun.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PasserError extends Exception{
     PasserError(String message){
          super(message);
     }
}
public class Passer {

     static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     public static char read(){
          char ch = ' ';
          try{
               ch = (char) br.read();
          }catch (IOException e){
               e.getStackTrace();
          }

          return ch;
     }
     public static void main(String[] args){

          for (int i = 0; i < 5; i++) {
               System.out.println(read());
          }
//          while(true){
//               System.out.println("\n\nEnter an expression, or press return to end.");
//               System.out.print("\n?  ");
//
//               char peek = read();
//               if(peek == '\n') break;
//
//               try{
//                    Node exp = expressionTree();
//                    if(peek != '\n')
//                         throw new PasserError("Extra data after end of expression.");
//
//                         System.out.println("\nValue at x = 0 is " + exp.value(0));
//                         System.out.println("Value at x = 1 is " + exp.value(1));
//                         System.out.println("Value at x = 2 is " + exp.value(2));
//                         System.out.println("Value at x = 3 is " + exp.value(3));
//                         System.out.println("\nOrder of postfix evaluation is:\n");
//                         exp.printStackCommands();
//               }catch (PasserError e){
//                    System.out.println("\n*** Error in input:    " + e.getMessage());
//                    System.out.println("*** Discarding input:  " + peek);
//               }
//          }
     }

     private static Node expressionTree() throws PasserError{
          boolean flag = read() == '-';

          Node node = termTree();
          if(flag) node = new UnaryMinusNode(node);

          char peek = read();
          while(peek == '+' || peek == '-'){
               Node nextTerm  = termTree();
               node = new OperatorNode(peek, node, nextTerm);

          }
          return node;
     }

     private static Node termTree() throws PasserError{
          Node term = factoryTree();

          char peek = read();
          while ( peek == '*' || peek == '/' ) {
               Node nextFactor = factoryTree();
               term = new OperatorNode(peek,term,nextFactor);
          }

          return term;
     }

     private static Node factoryTree() throws PasserError{
          char peek = read();

          if(Character.isDigit(peek)){
               return new ConstNode(Double.parseDouble( String.valueOf(peek)) );
          }else if(peek == 'x' || peek == 'X'){
               return new VariableNode();
          }else if(peek == '('){
               Node exp = expressionTree();
               if(read() == ')')
                    throw new PasserError("not close expression");
               return exp;
          }else if ( peek == '\n' )
               throw new PasserError("End-of-line encountered in the middle of an expression.");
          else if ( peek == ')' )
               throw new PasserError("Extra right parenthesis.");
          else if ( peek == '+' || peek == '-' || peek == '*' || peek == '/' )
               throw new PasserError("Misplaced operator.");
          else
               throw new PasserError("Unexpected character \"" + peek + "\" encountered.");


     }
}
