package com.chapter.two;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import com.chapter.two.util.LLNode;;


public class ReturnKthToLastTest {
    @Test
    public void returnKthToLastTest_WithNormalList_ShouldReturnEight() {
        LLNode head = new LLNode(0);
        LLNode node1 = new LLNode(7);
        LLNode node2 = new LLNode(8);
        LLNode node3 = new LLNode(9);
        LLNode node4 = new LLNode(11);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Optional<LLNode> solution = ReturnKthToLast.returnKthToLast(head, 2);

        assertEquals(8, solution.get().value);
    }

    @Test
    public void returnKthToLastTest_WithNull_ShouldReturnEmpty() {
        Optional<LLNode> solution = ReturnKthToLast.returnKthToLast(null, 2);
        assertEquals(Optional.empty(), solution);
    }

    @Test
    public void returnKthToLast_WithKEqualingN_ShouldReturnEmpty() {
        LLNode head = new LLNode(0);
        LLNode node1 = new LLNode(7);
        LLNode node2 = new LLNode(8);
        LLNode node3 = new LLNode(9);
        LLNode node4 = new LLNode(11);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Optional<LLNode> solution = ReturnKthToLast.returnKthToLast(head, 5);
        assertEquals(Optional.empty(), solution);
    }
}