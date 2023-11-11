package com.nhnacademy.groupstudy.chapter8.jinwoo.romannumeral;

import static com.nhnacademy.groupstudy.chapter8.jinwoo.romannumeral.EnumRomanNumerals.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RomanNumeral {
    private RomanNumeral(){}
    private static String[] toStringArr(String str){
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i)).toUpperCase();
        }
        return arr;
    }

    public static String toString(int num){
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException("Cannot calculate yet..");
        }
        StringBuilder sb = new StringBuilder();
        EnumRomanNumerals[] arr = EnumRomanNumerals.values();
        for (EnumRomanNumerals numerals : arr) {
            while(num >= numerals.value){
                sb.append(numerals.name());
                num -= numerals.value;
            }
        }
        return sb.toString();
    }

    public static int toInt(String str){
        int[] arr = Arrays.stream(toStringArr(str))
                .mapToInt(input -> search(numeral -> numeral.name().equals(input), numeral -> numeral.value))
                .toArray();

        int result = IntStream.range(0, str.length() - 1)
                .map(i -> arr[i] >= arr[i + 1] ? arr[i] : -arr[i])
                .sum();

        result += arr[str.length() - 1];

        return result;
    }

    public static void inputRomanNumeral() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Roman Numeral : ");
            String input = br.readLine();
            System.out.println("Result is : " + toInt(input));
        } catch(NumberFormatException e){
            System.out.println(e.getMessage());
            inputRomanNumeral();
        }
    }

    public static void inputNumber() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Number : ");
            int input = Integer.parseInt(br.readLine());
            System.out.println("Result is : " + toString(input));
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            inputNumber();
        }
    }
}
