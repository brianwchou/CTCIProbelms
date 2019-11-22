package com.chapter.two;

public class ReturnKthToLast {

    public LLNode returnKthToLast(LLNode head, int k) {
        // check if head is null
        if (head == null) {
            return null;
        }

        LLNode cursor = head;
        while (k > 0) {
            if (cursor.next == null)
                return null;
            cursor = cursor.next;
            k--;
        }

        LLNode answer = head;
        while (cursor != null) {
            cursor = cursor.next;
            answer = answer.next;
        }
        return answer;
    }


}