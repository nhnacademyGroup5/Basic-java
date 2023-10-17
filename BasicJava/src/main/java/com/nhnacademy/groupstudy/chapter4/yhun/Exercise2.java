package com.nhnacademy.groupstudy.chapter4.yhun;

public class Exercise2 {

    public static void main(String[] args) {

        String hexa = "ffff";

        long value = 0;
        for(int i=0; i<hexa.length(); i++){
            value += (long)Math.pow(16, i) * hexaValue(hexa.charAt(i));
        }
        System.out.println(value);

    }

    static int hexaValue(char hexa){
        int hexaCode = Character.toUpperCase(hexa);

        if(hexaCode > 47 && hexaCode < 58)
            return hexaCode - '0';
        if(hexaCode > 64 && hexaCode < 71)
            return hexaCode - 'A' + 10;

        return -1;
    }
}
