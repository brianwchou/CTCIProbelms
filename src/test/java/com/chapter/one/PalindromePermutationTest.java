package com.chapter.one;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromePermutationTest {

    @Test
    public void test_normal_input_value() {
        String testInput = "wllll";
        assertTrue(PalindromePermutation.isPermOfPalindrome(testInput));
    }
}