package com.nhnacademy.groupstudy.chapter4.jinwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Exercise8 {
    private static final Random random = new Random();
    private static final String[] operations = new String[] {"+", "-", "*", "/"};

    public static String question(){
        int first = random.nextInt(20) + 1;
        int second = random.nextInt(20) + 1;
        return first + " "+ operations[random.nextInt(4)] + " " + second;
    }

    public static Double answer(String question){
        String[] arr = question.split(" ");
        double first = Double.parseDouble(arr[0]);
        double second  = Double.parseDouble(arr[2]);
        switch (arr[1]){
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return Math.round(first / second * 100) / 100.0;
            default:
                return 0.0;
        }
    }

    public static int result(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            AtomicInteger count = new AtomicInteger();
            IntStream.range(0, 10).forEach(index -> {
                String question = question();
                System.out.print(question + " = ");
                try {
                    Double answer = Double.parseDouble(br.readLine());
                    if(answer(question).equals(answer)){
                        System.out.println("Correct");
                        count.getAndIncrement();
                    } else{
                        System.out.println("Wrong");
                        System.out.println("Answer is : " + answer(question));
                    }
                } catch (IOException e) {
                    e.getStackTrace();
                }
            });
            return count.get();
        } catch(IOException e){
            e.getStackTrace();
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = result();
        System.out.println("결과 : " + result + " / 10");
    }
}
