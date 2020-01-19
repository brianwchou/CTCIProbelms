package com.chapter.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class URLifyTest {

    @Test
    public void createAsURL_withNormalInput() {
        char[] input = "Mr John Smith    ".toCharArray();
        char[] answer = "Mr%20John%20Smith".toCharArray();
        
        URLify.createAsURL(input);

        assertArrayEquals(answer, input);
    }
}