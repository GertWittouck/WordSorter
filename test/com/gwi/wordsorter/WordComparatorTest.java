package com.gwi.wordsorter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordComparatorTest {

    private WordComparator testable;

    @Before
    public void setUp() {
        testable = new WordComparator();
    }

    @Test
    public void testCompareIgnoreCaseSameLengthAscending() {
        assertTrue(testable.compare("cat", "DOG") < 0);
    }

    @Test
    public void testCompareIgnoreCaseSameLengthDescending() {
        assertTrue(testable.compare("dog", "cat") > 0);
    }

    @Test
    public void testCompareIgnoreCaseSameLengthSameWord() {
        assertEquals(0, testable.compare("CAT", "cat"));
    }

    @Test
    public void testCompareIgnoreCaseDifferentLength() {
        assertEquals(0, testable.compare("banana", "cat"));
        assertEquals(0, testable.compare("cat", "banana"));
    }
}