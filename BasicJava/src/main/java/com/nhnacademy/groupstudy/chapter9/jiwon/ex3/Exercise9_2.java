package com.nhnacademy.groupstudy.chapter9.jiwon.ex3;

import static com.example.demo.chapter9.ex3.ReverseLinkedList.print;
import static com.example.demo.chapter9.ex3.ReverseLinkedList.reverseList;

public class Exercise9_2 {
    public static void main(String[] args) {
        ListNode originalList =
                new ListNode('a', new ListNode('b', new ListNode('c', new ListNode('d', null))));

        System.out.println("Original List:");
        print(originalList);

        ListNode reversedList = reverseList(originalList);

        System.out.println("Reversed List:");
        print(reversedList);
    }

}
