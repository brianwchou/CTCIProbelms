package com.chapter.one;

import java.util.HashMap;

public class CheckPermutation {
    /*
        Given 2 strings, write a method to decide if one is a permutation 
        of the other.
    */

    public static boolean isPermutation(String a, String b) {
        HashMap<Character, Integer> mapA = fillMap(a);
        HashMap<Character, Integer> mapB = fillMap(b);
        return mapA.equals(mapB);
    }

    private static HashMap<Character, Integer> fillMap(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            int count = map.getOrDefault(string.charAt(i), 0);
            map.put(string.charAt(i), count);
        }
        return map;
    }
    
}