package com.chapter.one;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckPermutationTest {
    @Test
    public void isPermutation_WithEmptyStrings_ShouldPass() {
        assertTrue(CheckPermutation.isPermutation("", ""));
    }

    @Test
    public void isPermutation_With_Should() {
        assertTrue(CheckPermutation.isPermutation("hownowbrowncow", "cowhownowbrown"));
    }

    @Test
    public void isPermutation_With_Shouldx() {
        assertFalse(CheckPermutation.isPermutation("hello", "world"));
    }

    @Test
    public void isPermutation_With_Shouldy() {
        assertFalse(CheckPermutation.isPermutation("hello", "hellllo"));
    }
}