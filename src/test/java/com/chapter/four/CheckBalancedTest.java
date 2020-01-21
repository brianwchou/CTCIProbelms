package com.chapter.four;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.chapter.four.util.BTNode;

import org.junit.jupiter.api.Test;

public class CheckBalancedTest {
    

    @Test
    void checkBalanced_withNormalTree() {
        // arrage
        BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);
        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);
        root.left.right.left = new BTNode(6);
        root.right.right = new BTNode(7);

        assertTrue(CheckBalanced.isTreeBalancedNaive(root), "");
        
        
    }
}