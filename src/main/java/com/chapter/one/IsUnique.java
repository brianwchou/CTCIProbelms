package com.chapter.one;

import java.util.Set;

public class IsUnique {
    /*
        Implement an algorithm to determine if a string has all unique characters. 
        What if you cannot use additional data structures?
    */

    /**
     * Complexity O(N) where N is the length of the input string
     * Space Complexity is dependent on the number of characters that will be used within the string
     * HashSet only grows with the number of characters are discoverable in the input.
     * 
     * @param string
     * @return boolean
     */
    public static boolean isStringMadeOfUniqueCharacters(String string) {
        int length = string.length(); 
        Set<Character> set = new HashSet<>(); 

        for (int i = 0; i < length; i++) {
            char c = string.charAt(i);
            if (set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }

        return true;
    }
}