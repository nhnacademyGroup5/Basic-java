package com.nhnacademy.groupstudy.chapter8.yhun.Roman;

public class RomaConvert {

     private String roman;
     private int romanInteger;
     private final char[] word = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
     public RomaConvert(String roman){
          this.roman = roman.toUpperCase();
          if(roman.isEmpty())
               throw new NumberFormatException("null");

          this.romanInteger = romaToInteger();
     }

     public RomaConvert(int romanInteger){
          if(romanInteger < 1 || romanInteger >= 4000)
               throw new NumberFormatException("over range error");
          this.romanInteger = romanInteger;
          this.roman = intToRoma();
     }

     private String intToRoma(){
          StringBuilder sb = new StringBuilder();
          int temp = romanInteger;
          int index = 0;

          while (temp > 0){
               if(RomaDecimal.values()[index].getValue() <= temp){
                    temp -= RomaDecimal.values()[index].getValue();
                    sb.append(RomaDecimal.values()[index].getRoma());
               } else{
                    index++;
               }
          }
          return sb.toString();
     }

     private int romaToInteger(){
          String temp = roman;
          int result = 0;
          int index = 0;

          while (!temp.isEmpty()){
               if(!checkRoma(temp) ){
                    throw new NumberFormatException("roma range error");
               }

               if(temp.indexOf(RomaDecimal.values()[index].getRoma()) == 0){
                    result += RomaDecimal.values()[index].getValue();
                    temp = temp.substring(RomaDecimal.values()[index].getValue());
               }else{
                    index++;
               }
          }
          return result;
     }

     private boolean checkRoma(String roman){
          boolean flag = false;
          for (char c : word) {
               if (roman.charAt(0) == c)
                    flag = true;
          }
          return flag;
     }
     @Override
     public String toString() {
          return this.roman;
     }

     public int toInt(){
          return this.romanInteger;
     }

     public static void main(String[] args) {
//          System.out.println(RomaDecimal.CD.ordinal());
//          System.out.println(RomaDecimal.values()[0].getRoma().length());
//          System.out.println(RomaDecimal.values()[0].getValue());

          RomaConvert c1 = new RomaConvert(10);
          RomaConvert c2 = new RomaConvert("II");

          System.out.println(c1.toInt() + " " + c1.toString());
          System.out.println(c2.toInt() + " " + c2.toString());

     }
}
