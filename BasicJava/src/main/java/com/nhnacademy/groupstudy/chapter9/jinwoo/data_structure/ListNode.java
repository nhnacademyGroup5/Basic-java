package com.nhnacademy.groupstudy.chapter9.jinwoo.data_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListNode<T> implements UniDirectional<T>{
    public static void main(String[] args) {
        ListNode<Integer> listnode = ListNode.create();
        listnode.insert(1);
        listnode.insert(2);
        listnode.insert(3);
        listnode.insert(4);
        listnode.insert(5);

        listnode.get((Consumer<Integer>) System.out::println);
        System.out.println();

        ListNode<Integer> reverse = listnode.reverse();

        reverse.get((Consumer<Integer>) System.out::println);
        System.out.println();

        System.out.println(reverse.size());
    }
    private T item;
    private ListNode<T> next;

    private ListNode() {}
    private ListNode(T item) {
        this.item = item;
    }

    public static <T> ListNode<T> create(){
        return new ListNode<>();
    }

    public static <T> ListNode<T> create(T item){
        return new ListNode<>(item);
    }

    public void insert(T item){
        if(this.item == null){
            this.item = item;
        } else if(next == null) {
            next = ListNode.create(item);
        } else{
            next.insert(item);
        }
    }

    public int size(){
        if(item != null){
            int nextSize = next == null ? 0 : next.size();
            return 1 + nextSize;
        }
        return 0;
    }

    public void get(Consumer<T> consumer){
        if(item != null){
            consumer.accept(item);
            if(next != null){
                next.get(consumer);
            }
        }
    }

    public T get(Predicate<T> predicate){
        if(item != null){
            if(predicate.test(item)){
                return item;
            }
            if(next != null){
                next.get(predicate);
            }
        }
        return null;
    }

    public ListNode<T> reverse(){
        ListNode<T> newListNode = ListNode.create();
        List<T> list = new ArrayList<>();

        get((Consumer<T>) list::add);

        Collections.reverse(list);
        list.forEach(newListNode::insert);

        return newListNode;
    }
}
