package com.nhnacademy.groupstudy.chapter7.yhun.list;

public interface List<T>{

     void add(T val);
     void add(int index, T val);

     int indexOf(T val);

     boolean remove(T val);
     T remove(int index);

     T get(int index);
     void set(int index, T val);

     int size();
     boolean isEmpty();

     void clear();


}
