package com.nhnacademy.groupstudy.chapter8.yhun.Roman;

public class RomaConvert {

     private String roman;
     private int romanInteger;
     private final char[] word = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

     public RomaConvert(String roman){
          if(roman.isEmpty())
               throw new NumberFormatException("null");
          this.roman = roman.toUpperCase();

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

          while (!temp.isEmpty() && index < RomaDecimal.values().length){
               if(!checkRoma(temp) ){
                    throw new NumberFormatException("roma range error");
               }

               if(temp.indexOf(RomaDecimal.values()[index].getRoma()) == 0){
                    result += RomaDecimal.values()[index].getValue();

                    if(temp.length() > RomaDecimal.values()[index].getRoma().length()){
                         temp = temp.substring(RomaDecimal.values()[index].getRoma().length());
                    }
                    else break;
               }else{
                    index++;
               }
          }
          if(result > 3999)
               throw new NumberFormatException("integer overflow");

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


}
