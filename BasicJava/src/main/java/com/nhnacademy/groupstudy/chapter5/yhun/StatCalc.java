package com.nhnacademy.groupstudy.chapter5.yhun;

public class StatCalc {

     private int count;
     private double min;
     private double max;
     private double sum;
     private double squareSum;

     public StatCalc(){
          min = Double.MAX_VALUE;
     }
     public void enter(double item){
          squareSum += Math.pow(item, 2);
          sum += item;
          count++;

          min = Math.min(item, min);
          max = Math.max(item, max);
     }

     public int getCount() {
          return count;
     }

     public double getMin() {
          return min;
     }

     public double getMax() {
          return max;
     }

     public double getSum() {
          return sum;
     }

     public double getMean(){
          if(count == 0)
               throw new ArithmeticException("0 나누기 불가");
          if(sum == 0)
               return 0;

          return sum / count;
     }

     public double getStandardDeviation(){
          if(squareSum == 0)
               return 0;

          return Math.sqrt(squareSum/count - Math.pow(getMean(), 2));
     }

     @Override
     public String toString() {
          return "StatCalc{" +
                  "count=" + getCount() +
                  ", min=" + getMin() +
                  ", max=" + getMax() +
                  ", sum=" + getSum() +
                  ", mean="+ getMean() +
                  ", StandardDeviation=" + getStandardDeviation() +
                  '}';
     }
}
