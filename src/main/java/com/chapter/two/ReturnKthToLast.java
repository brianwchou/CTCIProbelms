package com.chapter.two;

import java.util.Optional;

public class ReturnKthToLast {

    /*
        O(N) time constant space
    */
    public static Optional<LLNode> returnKthToLast(LLNode head, int k) {
        if (head == null) {
            return Optional.empty();
        }

        LLNode cursor = head;
        while (k > 0) {
            if (cursor.next == null)
                return Optional.empty();
            cursor = cursor.next;
            k--;
        }

        LLNode answer = head;
        while (cursor.next != null) {
            cursor = cursor.next;
            answer = answer.next;
        }
        return Optional.of(answer);
    }

}