package com.nhnacademy.groupstudy.chapter4.yhun;

import java.util.Arrays;

interface ArrayProcessor{
    double apply(double[] array);
}


public class Exercise5 {

    public static void main(String[] args) {

        ArrayProcessor searchMax = (list) -> {
            double max = 0;
            for (double v : list) {
                max = Math.max(max, v);
            }
            return max;
        };

        ArrayProcessor searchMin = (list) -> {
            double min = Double.MAX_VALUE;
            for (double v : list) {
                min = Math.min(min, v);
            }
            return min;
        };

        ArrayProcessor sum = (list) -> {
            double total = 0;
            for (double v : list) {
                total += v;
            }
            return total;
        };

        ArrayProcessor avg = (list) -> {
            double total = 0;
            for (double v : list) {
                total += v;
            }
            return total/list.length;
        };

        double[] arr = {1.1, 1.2, 4, 2, 11.5};

        System.out.println(searchMax.apply(arr));
        System.out.println(searchMin.apply(arr));
        System.out.println(sum.apply(arr));
        System.out.println(avg.apply(arr));

        // ArrayProcessor에 대응하는 stream()
        double maxValue = Arrays.stream(arr).reduce(0, (max, value) -> Math.max(max, value));
        double minValue = Arrays.stream(arr).reduce(Double.MAX_VALUE, (min, value) -> Math.min(min, value));
        double sumValue = Arrays.stream(arr).reduce(0, (result, value) -> result + value);
        double avgValue = sumValue / Arrays.stream(arr).count();
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(sumValue);
        System.out.println(avgValue);
    }



}
