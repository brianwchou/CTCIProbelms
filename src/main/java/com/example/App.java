package com.example;

import java.util.Arrays;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println(calculate(new int[]{3,4,-4,8,11,-1,6}, 10));
    }

    public static int calculate(int[] array, int targetSum) {
        Arrays.sort(array);
        System.out.println(String.format("array: %s | targetSum: %d", Arrays.toString(array), targetSum));
        return 0;
    }


}
