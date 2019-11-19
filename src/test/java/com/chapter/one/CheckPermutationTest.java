package com.chapter.one;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckPermutationTest {
    @Test
    public void isPermutation_WithEmptyStrings_ShouldReturnTrue() {
        assertTrue(CheckPermutation.isPermutation("", ""));
    }

    @Test
    public void isPermutation_WithTwoStringsSameWords_ShouldReturnTrue() {
        assertTrue(CheckPermutation.isPermutation("hownowbrowncow", "cowhownowbrown"));
    }

    @Test
    public void isPermutation_WithTwoDifferentWords_ShouldReturnFalse() {
        assertFalse(CheckPermutation.isPermutation("hello", "world"));
    }

    @Test
    public void isPermutation_WithTwoWordsSameLettersDifferentCounts_ShouldReturnFalse() {
        assertFalse(CheckPermutation.isPermutation("hello", "hellllo"));
    }
}