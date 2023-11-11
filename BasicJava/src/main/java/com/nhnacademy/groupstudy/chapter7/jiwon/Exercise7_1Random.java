package com.nhnacademy.groupstudy.chapter7.jiwon;

import java.util.ArrayList;

public class Exercise7_1Random<T extends Number> {

    private final ArrayList<T> numberList;
    private final RandomNumberGenerator<T> generator;

    public Exercise7_1Random(RandomNumberGenerator<T> generator) {
        this.generator = generator;
        numberList = new ArrayList<>();
    }

//    @Override
//    public T get(int index) {
//        if (index < 0 || index >= numberList.size()) {
//            throw new IndexOutOfBoundsException("Index out of bounds");
//        }
//        return numberList.get(index);
//    }
//
//    @Override
//    public int size() {
//        return numberList.size();
//    }

    public T getRandomNumber(T count, T max) {
        if (count.doubleValue() > max.doubleValue()) {
            throw new IllegalArgumentException("Count cannot be greater than max");
        }

        T num;
        do {
            num = generator.getRandomNumber(count, max);
        } while (numberList.contains(num));

        numberList.add(num);
        return num;
    }
}