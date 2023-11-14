package com.nhnacademy.groupstudy.chapter9.jinwoo.data_structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListNode<T> implements Node<T>{
    public static void main(String[] args) {
        ListNode<Integer> listnode = ListNode.create();
        listnode.insert(1);
        listnode.insert(2);
        listnode.insert(3);
        listnode.insert(4);
        listnode.insert(5);

        listnode.forEach(System.out::println);
        System.out.println();

        ListNode<Integer> reverse = listnode.reverse();

        reverse.forEach(System.out::println);
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

    private boolean equalValue(T item){
        return this.item.equals(item);
    }

    public void remove(T item){
        if(!this.contains(item)){
            throw new NoSuchElementException("찾는 값이 없습니다.");
        }
        if(equalValue(item)){
            this.clear();
        } else {
            next.remove(item);
        }
    }

    public void clear(){
        item = null;
        next = null;
    }

    public boolean contains(T item){
        if(equalValue(item)){
            return true;
        } else if(next != null){
            return next.contains(item);
        } else{
            return false;
        }
    }

    public int size(){
        if(item != null){
            int nextSize = next == null ? 0 : next.size();
            return 1 + nextSize;
        }
        return 0;
    }

    public ListNode<T> search(T item) {
        if(!this.contains(item)){
            throw new NoSuchElementException("찾는 값이 없습니다.");
        }
        return equalValue(item) ? this : next.search(item);
    }

    public void forEach(Consumer<T> consumer){
        if(item != null){
            consumer.accept(item);
            if(next != null){
                next.forEach(consumer);
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

        this.forEach(list::add);

        Collections.reverse(list);
        list.forEach(newListNode::insert);

        return newListNode;
    }
}
