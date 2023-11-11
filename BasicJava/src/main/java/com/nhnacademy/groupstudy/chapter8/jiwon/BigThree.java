package com.nhnacademy.groupstudy.chapter8.jiwon;

import java.math.BigInteger;
import java.util.Scanner;

public class BigThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number;
        String line;

        while (true) {
            System.out.println("Enter num :");
            line = sc.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }
            try {
                number = new BigInteger(line);
                if (number.signum() == 1) {
                    printThreenN(number);
                } else {
                    System.out.println("Error");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private static void printThreenN(BigInteger number) {
        assert number != null && number.signum() == 1 : "Illegal parameter";
        int count = 1;

        while (!number.equals(BigInteger.ONE)) {
            if (number.testBit(0) == false) {
                number = number.divide(BigInteger.TWO);
            } else {
                number = number.multiply(BigInteger.valueOf(3L));
                number = number.add(BigInteger.ONE);
            }

            count++;
        }
        System.out.println(count);
    }


}
