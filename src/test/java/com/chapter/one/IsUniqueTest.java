package com.chapter.one;


import org.junit.Test;

public class IsUniqueTest {
    
    @Test
    public void isStringMadeOfUniqueCharacters_withNonUniqueString_shouldFail() {
        assertFalse(IsUnique.isStringMadeOfUniqueCharacters("hello world!"));
    }

    @Test
    public void isStringMadeOfUniqueCharacters_withUniqueString_shouldPass() {
        assertTrue(IsUnique.isStringMadeOfUniqueCharacters("blue harit"));
    }

    @Test
    public void isStringMadeOfUniqueCharacters_withEmptyString_shouldPass() {
        assertTrue(IsUnique.isStringMadeOfUniqueCharacters(""));
    }

}