package com.nhnacademy.groupstudy.chapter7.jinwoo.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Lists<T extends Comparable<T>> extends ArrayList<T> {
    private final List<T> list = new ArrayList<>();

    public void add(Supplier<T> supplier, int max){
        if (max < 1) {
            throw new IllegalArgumentException("1 이상의 정수를 입력하세요");
        }
        IntStream.rangeClosed(1, max)
                .forEach(i -> list.add(supplier.get()));
    }

    public void print(){
        list.iterator()
                .forEachRemaining(System.out::println);
    }

    public void sort(){
        Collections.sort(list);
    }

    public void selectionSort(){
        List<T> tmp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            T min = tmp.stream()
                    .min(Comparator.naturalOrder())
                    .orElseThrow(NoSuchElementException::new);
            list.set(i, min);
            tmp.remove(min);
        }
    }
}
