package com.nhnacademy.groupstudy.chapter7.jiwon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        System.out.println("input number : ");
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
            count++;
        }
        System.out.println(selectSort(list, count));
    }

    static List<Integer> selectSort(List<Integer> list, int count) {
        for (int i = count - 1; i > 0; i--) {
            int maxLoc = 0;
            for (int j = 1; j <= i; j++) {
                if (list.get(j) > list.get(maxLoc)) {
                    maxLoc = j;
                }
            }

            int temp = list.get(maxLoc);
            list.set(maxLoc, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
}
