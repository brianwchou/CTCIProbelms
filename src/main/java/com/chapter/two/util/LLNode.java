package com.chapter.two.util;

import java.util.ArrayList;

public class LLNode {
    public int value;
    public LLNode next;

    public LLNode(int value) {
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