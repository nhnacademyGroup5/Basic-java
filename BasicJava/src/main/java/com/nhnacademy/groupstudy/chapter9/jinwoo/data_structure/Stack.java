package com.nhnacademy.groupstudy.chapter9.jinwoo.data_structure;

public class Stack<T>{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    private ListNode<T> top;

    public void push(T item){
        if(this.isEmpty()){
            top = ListNode.create(item);
        } else{
            top.insert(item);
        }
    }

    public T pop(){
        if(isEmpty()){
            throw new NullPointerException("비어 있습니다.");
        }
        T poppedItem = top.getLast();
        top.removeLast();
        return poppedItem;
    }

    public boolean isEmpty(){
        return top == null;
    }

}
