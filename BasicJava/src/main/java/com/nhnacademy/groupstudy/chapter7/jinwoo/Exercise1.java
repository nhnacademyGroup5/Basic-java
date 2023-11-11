package com.nhnacademy.groupstudy.chapter7.jinwoo;


import com.nhnacademy.groupstudy.chapter7.jinwoo.lists.Lists;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        Random random = new Random();
        Lists<Integer> list = new Lists<>();
        list.add(() -> random.nextInt(10) + 1, 10);
        list.print();
    }
}
