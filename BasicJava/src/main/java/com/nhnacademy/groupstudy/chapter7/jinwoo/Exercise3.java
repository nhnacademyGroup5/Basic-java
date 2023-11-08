package com.nhnacademy.groupstudy.chapter7.jinwoo;

import com.nhnacademy.groupstudy.chapter7.jinwoo.lists.Lists;
import java.util.Random;

// Exercise 5번 포함
public class Exercise3 {
    public static void main(String[] args) {
        Lists<Integer> lists = new Lists<>();
        lists.add(() -> new Random().nextInt(10) + 1, 10);
        lists.print();
        System.out.println();
        lists.selectionSort();
        lists.print();
    }
}
