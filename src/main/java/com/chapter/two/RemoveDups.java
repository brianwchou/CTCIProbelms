package com.chapter.two;

public class RemoveDups {

    public static void removeDups(LLNode head) {
        while (head != null) {
            int value = head.value;
            System.out.printf("%d, %b%n", value, head.next != null);
            LLNode cursor = head;
            while (cursor != null && cursor.next != null) {
                if (cursor.next.value == value) {
                    cursor.next = cursor.next.next;
                }
                cursor = cursor.next;
            }
            head = head.next;
        }
    }
}