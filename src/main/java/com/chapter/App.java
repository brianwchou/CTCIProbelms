package com.chapter;

import com.chapter.four.BSTSequences;
import com.chapter.four.util.BTNode;

public class App {
    public static void main(String[] args) {

        BTNode root = new BTNode(4);
        root.left = new BTNode(2);
        root.right = new BTNode(7);
        root.left.left = new BTNode(1);
        root.left.right = new BTNode(3);
        root.right.left = new BTNode(6);
        root.right.right = new BTNode(8);

        System.out.println(BSTSequences.findSequences(root).toString());
    }
}