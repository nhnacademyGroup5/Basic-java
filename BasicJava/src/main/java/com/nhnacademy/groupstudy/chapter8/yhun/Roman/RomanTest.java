package com.nhnacademy.groupstudy.chapter8.yhun.Roman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RomanTest {

     public static void main(String[] args) throws IOException {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          RomaConvert convert = null;

          System.out.println("Enter a Roman numeral and I will convert it to an ordinary");
          System.out.println("arabic integer.  Enter an integer in the range 1 to 3999");
          System.out.println("and I will convert it to a Roman numeral.  Press return when");
          System.out.println("you want to quit.\n");

          System.out.println(new RomaConvert("M").toInt());
          while (true){
               System.out.print("Roman numeral or Integer input : ");
               String temp = br.readLine();

               try {
                    if(!digitCheck(temp))
                         convert = new RomaConvert(temp);
                    else {
                              convert = new RomaConvert(Integer.parseInt(temp));
                    }
               }catch (NumberFormatException e){
                    e.printStackTrace();
                    System.out.println("숫자 범위는 1~ 3999까지 설정.");
               }
               System.out.println(convert.toInt() + " " + convert.toString());
               System.out.print("y/n : ");
               if(br.readLine().toUpperCase().charAt(0) == 'N') break;
          }

     }

     private static boolean digitCheck(String temp){
          for(int i=0; i<temp.length(); i++){
               if(!Character.isDigit(temp.charAt(i)))
                    return false;
          }
          return true;
     }

}
