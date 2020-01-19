package com.chapter.two;

import com.chapter.two.util.LLNode;

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