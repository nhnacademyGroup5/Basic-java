package com.nhnacademy.groupstudy.chapter7.jiwon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array<T extends Comparable<T>> {
    List<T> list;

    public Array() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public List<T> sortList() {
        Collections.sort(list);
        return list;
    }
}