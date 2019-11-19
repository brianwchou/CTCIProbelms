package com.chapter.one;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    /*
        Given 2 strings, write a method to decide if one is a permutation 
        of the other.
    */

    public static boolean isPermutation(String a, String b) {
        Map<Character, Integer> mapA = fillMap(a);
        Map<Character, Integer> mapB = fillMap(b);
        return mapA.equals(mapB);
    }

    private static Map<Character, Integer> fillMap(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            int count = map.getOrDefault(string.charAt(i), 0);
            map.put(string.charAt(i), count + 1);
        }
        return map;
    }
    
}