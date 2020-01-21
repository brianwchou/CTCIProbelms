package com.chapter.four;

import com.chapter.four.util.BTNode;

/*
    4.4 Check Balanced: implement a function to check if a binary tree is balanced. For
    the purposes of this question, a balanced tree is defined such that the heights of 
    the subtrees of any node never differ by more than one.
*/

public class CheckBalanced {
    
    /*
        this method runs at O(N^2) time since the count is caluclated at
        very node which requires you to 
    */
    public static boolean isTreeBalancedNaive(BTNode root) {
        if (root == null) {
            return true;
        }
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return isTreeBalancedNaive(root.left) && isTreeBalancedNaive(root.right);
    }

    private static int getHeight(BTNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }
}