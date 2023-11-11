package com.nhnacademy.groupstudy.chapter7.jiwon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayRandom {
    List<Double> list;

    public ArrayRandom() {
        list = new ArrayList<>();
    }

    public void generateRandomList(int input) {
        Random random = new Random();
        list = random.doubles()
                .limit(input)
                .boxed()
                .collect(Collectors.toList());
    }
}