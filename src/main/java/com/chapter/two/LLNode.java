package com.chapter.two;

import java.util.ArrayList;

public class LLNode {
    int value;
    LLNode next;

    LLNode(int value) {
        this.value = value;
    }

    public ArrayList<Integer> toArrayList() {
        ArrayList<Integer> aList = new ArrayList<>();
        helper(this, aList);
        return aList;
    }

    private void helper(LLNode node, ArrayList<Integer> aList) {
        if (node == null) {
            return;
        }
        aList.add(node.value);
        helper(node.next, aList);
    }
}