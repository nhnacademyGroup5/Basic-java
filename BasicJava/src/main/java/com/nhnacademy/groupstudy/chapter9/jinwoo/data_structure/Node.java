package com.nhnacademy.groupstudy.chapter9.jinwoo.data_structure;

public interface Node<T> {
    void insert(T item);
    void remove(T item);
    void clear();
    boolean contains(T item);
    Node<T> search(T item);

}
