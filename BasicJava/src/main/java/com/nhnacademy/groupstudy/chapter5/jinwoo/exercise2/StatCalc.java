package com.nhnacademy.groupstudy.chapter5.jinwoo.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */

public class StatCalc {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private final List<Double> list = new ArrayList<>();

    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        try {
            if (num == 0) {
                throw new IllegalArgumentException("0은 넣을 수 없습니다.");
            }
            count++;
            sum += num;
            squareSum += num*num;
            list.add(num);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        return sum / count;
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }

    public double getMax(){
        return list.stream().reduce(Math::max).orElse(0.0);
    }

    public double getMin(){
        return list.stream().reduce(Math::min).orElse(0.0);
    }

    public void print(){
        if (list.isEmpty()) {
            System.out.println("Empty");
        } else{
            System.out.println("Sum : " + getSum());
            System.out.println("Mean : " + getMean());
            System.out.println("Standard Deviation : " + getStandardDeviation());
            System.out.println("Count : " + getCount());
            System.out.println("Max : " + getMax());
            System.out.println("Min : " + getMin());
        }
    }

    public void start(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            double input = Double.parseDouble(br.readLine());
            try {
                while(input != 0){
                    enter(input);
                    print();
                    input = Double.parseDouble(br.readLine());
                }
            } catch(NumberFormatException e){
                System.out.println("숫자만 입력 해주세요.");
                start();
            }
        } catch(IOException e){
            e.getStackTrace();
        }
    }

}  // end class StatCalc
