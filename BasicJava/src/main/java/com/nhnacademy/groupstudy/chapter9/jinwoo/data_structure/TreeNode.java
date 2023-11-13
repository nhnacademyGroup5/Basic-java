package com.nhnacademy.groupstudy.chapter9.jinwoo.data_structure;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TreeNode<T extends Comparable<T>> implements BiDirectional<T>{
    public static void main(String[] args) {
        TreeNode<String> tree = TreeNode.create();
        tree.insert("b");
        tree.insert("a");
        tree.insert("c");
        tree.insert("h");
        tree.insert("k");
        tree.preOrder((Consumer<String>) System.out::println);
    }
    protected T root;
    protected TreeNode<T> left;
    protected TreeNode<T> right;

    private TreeNode(T item){
        this.root = item;
    }

    private TreeNode(){
    }

    public static <T extends Comparable<T>> TreeNode<T> create() {
        return new TreeNode<>();
    }

    public static <T extends Comparable<T>> TreeNode<T> create(T item){
        return new TreeNode<>(item);
    }
    public void insert(T item) {
        if(root == null){
            root = item;
        } else if ( item.compareTo(root) < 0 ) {
            if (left == null ) {
                left = TreeNode.create(item);
            } else{
                left.insert(item);
            }
        } else {
            if (right == null ) {
                right = TreeNode.create(item);
            } else {
                right.insert(item);
            }
        }
    }

    public boolean contains(T item) {
        if (item == null) {
            return false;
        }
        else if ( item.equals(root) ) {
            return true;
        }
        else if ( item.compareTo(root) < 0 && left != null) {
            return left.contains(item);
        }
        else if(right != null){
            return right.contains(item );
        }
        throw new NoSuchElementException("찾는 값이 없습니다.");
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

    private T get(Predicate<T> predicate, TreeNode<T> one, TreeNode<T> another) {
        if (root != null) {
            if (predicate.test(root)) {
                return root;
            }
            if (one != null) {
                return one.preOrder(predicate);
            }
            if (another != null) {
                return another.preOrder(predicate);
            }
        }
        return null;
    }

    private void get(Consumer<T> consumer, TreeNode<T> one, TreeNode<T> another){
        if(root != null){
            consumer.accept(root);
            if(one != null){
                one.preOrder(consumer);
            }
            if(another != null){
                another.preOrder(consumer);
            }
        }
    }

    public void inOrder(Consumer<T> consumer){
        if(root != null){
            if(left != null){
                left.preOrder(consumer);
            }
            consumer.accept(root);
            if(right != null){
                right.preOrder(consumer);
            }
        }
    }

    public void preOrder(Consumer<T> consumer){
        get(consumer, left, right);
    }

    public void postOrder(Consumer<T> consumer){
        get(consumer, right, left);
    }

    public T inOrder(Predicate<T> predicate){
        if(root != null){
            if(left != null){
                left.preOrder(predicate);
            }
            if(predicate.test(root)){
                return root;
            }
            if(right != null){
                right.preOrder(predicate);
            }
        }
        return null;
    }

    public T preOrder(Predicate<T> predicate){
        return get(predicate, left, right);
    }

    public T postOrder(Predicate<T> predicate) {
        return get(predicate, right, left);
    }

}
