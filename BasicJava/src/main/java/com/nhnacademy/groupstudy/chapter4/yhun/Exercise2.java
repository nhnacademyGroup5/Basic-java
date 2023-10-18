package com.nhnacademy.groupstudy.chapter4.yhun;

public class Exercise2 {

    public static void main(String[] args) {

        String hexa = "ffff";
        String binary = "1111";

        System.out.println(convert(hexa, 16));
        System.out.println(convert(binary, 2));

    }

    static long convert(String data, int option){
        long value = 0;
        for(int i=0; i<data.length(); i++){
            int ascii = hexaValue(data.charAt(i));
            if(ascii == -1) return -1;

            value += (long)Math.pow(option, i) * ascii;
        }

        return value;
    }

    static int hexaValue(char hexa){
        int ascii = Character.toUpperCase(hexa);

        if(ascii > 47 && ascii < 58)
            return ascii - '0';
        if(ascii > 64 && ascii < 71)
            return ascii - 'A' + 10;

        return -1;
    }
}
