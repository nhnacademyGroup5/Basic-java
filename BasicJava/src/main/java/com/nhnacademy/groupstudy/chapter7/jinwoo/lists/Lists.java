package com.nhnacademy.groupstudy.chapter7.jinwoo.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Lists<T> {
    private final List<T> list = new ArrayList<>();

    public void add(T input){
        list.add(input);
    }

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
}
