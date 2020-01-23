package com.chapter.four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.chapter.four.util.BTNode;

public class BSTSequences {
    
    public static List<List<String>> findSequences(BTNode root) {

        List<List<String>> possibles = new ArrayList<>();
        Queue<BTNode> level = new LinkedList<>();

        level.offer(root);
        while (!level.isEmpty()) {
            // add left and add right if availiable
            String levelString = queueToString(level);

            ArrayList<String> list = new ArrayList<>();
            fillPermutations(list, levelString, 0, levelString.length() - 1);
            possibles.add(list);

            // create empty currentlevel and create next level
            Queue<BTNode> next = new LinkedList<>();
            while (!level.isEmpty()) {
                BTNode node = level.poll();

                if (node.left != null) {
                    next.add(node.left);
                }

                if (node.right != null) {
                    next.add(node.right);
                }
            }

            level = next;
        }


        
        // take possiblities and create full results

        return possibles;
    }

    private static String queueToString(Queue<BTNode> queue) {
        StringBuilder sb = new StringBuilder();

        queue.stream().forEach((element) -> {
            sb.append(element.value);
        });

        return sb.toString();
    }


    private static void fillPermutations(ArrayList<String> al, String sb, int l, int r) {
        if (l == r) {
            al.add(sb.toString());
        } else {
            for (int i = l; i <= r; i++) {
                sb = swap(sb, l, i);
                fillPermutations(al, sb, l, r);
                sb = swap(sb, l, i);
            }
        }
    }


    private static String swap(String sb, int a, int b) {
        char temp;
        char[] charArray = sb.toCharArray();
        temp = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;
        return String.valueOf(charArray);
    }
}