package com.chapter.one;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CheckPermutationTest {

    @Test
    public void isPermutation_WithEmptyStrings_ShouldReturnTrue() {
        String emptyString = "";

        assertTrue(
            CheckPermutation.isPermutation(emptyString, emptyString),
            String.format("should return TRUE when testing empty string with empty string"));
    }

    @Test
    public void isPermutation_WithTwoStringsSameWords_ShouldReturnTrue() {
        String testString1 = "hownowbrowncow";
        String testString2 = "cowhownowbrown";

        assertTrue(
            CheckPermutation.isPermutation(testString1, testString2),
            String.format("should return TRUE for %s and %s", testString1, testString2));
    }

    @Test
    public void isPermutation_WithTwoDifferentWords_ShouldReturnFalse() {
        String testString1 = "hello";
        String testString2 = "world";

        assertFalse(
            CheckPermutation.isPermutation(testString1, testString2),
            String.format("should return FALSE for %s and %s", testString1, testString2));
    }

    @Test
    public void isPermutation_WithTwoWordsSameLettersDifferentCounts_ShouldReturnFalse() {
        String testString1 = "hello";
        String testString2 = "hellllo";

        assertFalse(
            CheckPermutation.isPermutation(testString1, testString2),
            String.format("should return FALSE for %s and %s", testString1, testString2));
    }
}