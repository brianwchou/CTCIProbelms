package com.chapter.one;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsUniqueTest {
    
    @Test
    public void isStringMadeOfUniqueCharacters_withNonUniqueString_shouldFail() {
        String nonUniqueString = "hello world!";

        assertFalse(
            IsUnique.isStringMadeOfUniqueCharacters(nonUniqueString), 
            String.format("should return FALSE for %s", nonUniqueString));
    }

    @Test
    public void isStringMadeOfUniqueCharacters_withUniqueString_shouldPass() {
        String uniqueString = "blue harit";

        assertTrue(
            IsUnique.isStringMadeOfUniqueCharacters(uniqueString), 
            String.format("should return TRUE for %s", uniqueString));
    }

    @Test
    public void isStringMadeOfUniqueCharacters_withEmptyString_shouldPass() {
        // setup
        String emptyString = "";

        assertTrue(
            IsUnique.isStringMadeOfUniqueCharacters(emptyString), 
            String.format("should return TRUE for %s", emptyString));
    }
    
}