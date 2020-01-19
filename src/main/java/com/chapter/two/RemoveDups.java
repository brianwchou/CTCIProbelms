package com.chapter.two;

import com.chapter.two.util.LLNode;

/*
    Problem:  Remove Dups: write code to remove duplicates from an unsorted linked list
    FOLLOW UP
    How would you solve this problem if a temporary buffer is not allowed?

    first method requires no extra memory but its run time is O(N^2)
    since you have 2 loops with an inner loop scanning the list 
    potentially throughout to find any duplicates of a current node

    TODO: removeDups with a hashset
*/

public class RemoveDups {

    public static void removeDups(LLNode head) {
        while (head != null) {
            int value = head.value;
            LLNode prev = head;
            LLNode cursor = head.next;

            while (cursor != null) {
                if (cursor.value == value) {
                    prev.next = cursor.next;
                    cursor = cursor.next;
                } else {
                    prev = cursor;
                    cursor = cursor.next;
                }            
            }
            head = head.next;
        }
    }
}