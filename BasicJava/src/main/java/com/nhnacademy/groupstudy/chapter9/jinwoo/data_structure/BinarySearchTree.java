package com.nhnacademy.groupstudy.chapter9.jinwoo.data_structure;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class BinarySearchTree<T extends Comparable<T>> implements Node<T>{
    public static void main(String[] args) {
        BinarySearchTree<String> tree = BinarySearchTree.create();
        tree.insert("b");
        tree.insert("a");
        tree.insert("c");
        tree.insert("h");
        tree.insert("k");
        tree.inOrderTraverse(System.out::println);
    }

    private T root;
    private BinarySearchTree<T> left;
    private BinarySearchTree<T> right;

    private BinarySearchTree(T item){
        this.root = item;
    }

    private BinarySearchTree(){
    }

    public static <T extends Comparable<T>> BinarySearchTree<T> create() {
        return new BinarySearchTree<>();
    }

    public static <T extends Comparable<T>> BinarySearchTree<T> create(T item){
        return new BinarySearchTree<>(item);
    }
    public void insert(T item) {
        if(root == null){
            root = item;
        } else if ( item.compareTo(root) < 0 ) {
            if (left == null ) {
                left = BinarySearchTree.create(item);
            } else{
                left.insert(item);
            }
        } else {
            if (right == null ) {
                right = BinarySearchTree.create(item);
            } else {
                right.insert(item);
            }
        }
    }

    public void remove(T item){
        if(root == null || !this.contains(item)){
            throw new NoSuchElementException("찾는 값이 없습니다.");
        }
        if(item.compareTo(root) < 0){
            left.remove(item);
        } else if(item.compareTo(root) > 0){
            right.remove(item);
        } else {
            this.clear();
        }
    }

    public void clear(){
        root = null;
        left = null;
        right = null;
    }

    public boolean contains(T item) {
        if ( item.equals(root) ) {
            return true;
        }
        else if ( item.compareTo(root) < 0 && left != null) {
            return left.contains(item);
        }
        else if(right != null){
            return right.contains(item );
        } else{
            return false;
        }
    }

    public int count() {
        int countLeft = 0;
        int countRight = 0;
        if(root == null){
            return 0;
        }
        if(left != null){
            countLeft = left.count();
        }
        if(right != null){
            countRight = right.count();
        }
        return 1 + countLeft + countRight;
    }

    public BinarySearchTree<T> search(T item){
        if(!contains(item)){
            throw new NoSuchElementException("찾는 값이 없습니다.");
        }
        if(item.compareTo(root) < 0){
            return left.search(item);
        } else if(item.compareTo(root) > 0 ){
            return right.search(item);
        } else{
            return this;
        }
    }

    public void inOrderTraverse(Consumer<T> consumer){
        if(root != null){
            if(left != null){
                left.inOrderTraverse(consumer);
            }
            consumer.accept(root);
            if(right != null){
                right.inOrderTraverse(consumer);
            }
        }
    }

    public void preOrderTraverse(Consumer<T> consumer){
        if(root != null){
            consumer.accept(root);
            if(left != null){
                left.inOrderTraverse(consumer);
            }
            if(right != null){
                right.inOrderTraverse(consumer);
            }
        }
    }

    public void postOrderTraverse(Consumer<T> consumer) {
        if(root != null){
            consumer.accept(root);
            if(right != null){
                right.inOrderTraverse(consumer);
            }
            if(left != null){
                left.inOrderTraverse(consumer);
            }
        }
    }
}
