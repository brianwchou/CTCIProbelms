package com.chapter.one;

import java.util.HashMap;

/*
    1.4 Palindrome Permutation: Given a string, write a function to check if it is 
    a permutation of a palindrome. A permutation is a rearragement of letters. The 
    palindrome does not need to be limited to just dictionary words.
*/
public class PalindromePermutation {


    /*
        This implementation runs at O(N) where N is the length of the string
        map only grows with the number of distint characters within the input string
    */
    public static boolean isPermOfPalindrome(String permutation) {
        // looking for even number of characters
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < permutation.length(); i++) {
            char letter = permutation.charAt(i);
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }

        // only allowed one character to have an odd number
        System.out.println(map.toString());
        boolean oddNumFound = false;
        for (int num : map.values()) {
            if (num % 2 != 0) {
                if (!oddNumFound) {
                    oddNumFound = true;
                } else {
                    return false;
                }
            }

        }

        return true;
    }
}