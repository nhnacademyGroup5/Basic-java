package com.nhnacademy.groupstudy.chapter3.yhun;

import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {

        int leftEye;
        int rightEye;
        int count = 0;

        while (true){
            count++;
            leftEye = random();
            rightEye = random();

            if(leftEye == 1 && rightEye == 1)
                break;
        }

        System.out.println("count : " + count);
    }

    static int random(){
        return (int)(Math.random() * 6) + 1;
    }
}
