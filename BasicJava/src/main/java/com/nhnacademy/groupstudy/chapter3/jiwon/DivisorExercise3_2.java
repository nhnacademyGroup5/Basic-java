package com.nhnacademy.groupstudy.chapter3.jiwon;

public class DivisorExercise3_2 {


    public static void main(String[] args) {

        DivisorMax divisorMax = new DivisorMax();
        int maxNumber = divisorMax.divisorMax(10000);
        divisorMax.print(String.valueOf(maxNumber));

    }


}


