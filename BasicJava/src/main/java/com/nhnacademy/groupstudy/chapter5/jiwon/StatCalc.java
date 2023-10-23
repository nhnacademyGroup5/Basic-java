package com.nhnacademy.groupstudy.chapter5.jiwon;

public class StatCalc {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private double max = Double.NEGATIVE_INFINITY;  // Largest item seen.
    private double min = Double.POSITIVE_INFINITY;  // Smallest item seen.

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num * num;
        if (num > max) {
            max = num;
        }
        if (num < min) {
            min = num;
        }
    }


    public int getCount() {
        return count;
    }


    public double getSum() {
        return sum;
    }

    public double getMean() {
        return sum / count;
    }

    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt(squareSum / count - mean * mean);
    }

}