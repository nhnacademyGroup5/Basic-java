package com.nhnacademy.groupstudy.chapter8.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static double root( double a, double b, double c ) {
        if (a == 0) {
            throw new IllegalArgumentException("A can't be zero.");
        }
        else {
            double disc = b*b - 4*a*c;
            if (disc < 0)
                throw new IllegalArgumentException("Discriminant < zero.");
            return  (-b + Math.sqrt(disc)) / (2*a);
        }
    }

    public static void print() throws IOException{
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Set value a : ");
            double a = Double.parseDouble(br.readLine());
            System.out.print("Set value b : ");
            double b = Double.parseDouble(br.readLine());
            System.out.print("Set value c : ");
            double c = Double.parseDouble(br.readLine());
            System.out.println("Answer is " + root(a,b,c));
            System.out.println("Do you want another equation? (y/n)");
            if(br.readLine().equals("y")) print();
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            print();
        }
    }

    public static void main(String[] args) throws IOException {
        print();
    }
}
