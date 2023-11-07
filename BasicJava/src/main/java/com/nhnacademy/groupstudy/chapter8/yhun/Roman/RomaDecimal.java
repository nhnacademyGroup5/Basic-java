package com.nhnacademy.groupstudy.chapter8.yhun.Roman;


enum RomaDecimal{
     M(1000, "M"), CM(900, "CM"), D(500, "D"), CD(400, "CD"),
     C(100, "C"), XC(90, "XC"),  L(50, "L"), XL(40, "XL"), X(10, "X"),
     IX(9, "IX"), V(5, "V"), IV(4, "IV"), I(1, "I");

     private int value;
     private String roma;
     RomaDecimal(int value, String roma) {
          this.value = value;
          this.roma = roma;
     }

     public int getValue(){
          return this.value;
     }

     public String getRoma(){
          return this.roma;
     }

}