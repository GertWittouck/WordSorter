package com.gwi.wordsorter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StringSorterTest {

    private Sorter<String> testable;

    @org.junit.Before
    public void setUp() {
        testable = new StringSorter();
    }

    @Test
    public void testNoInput() {
        Collection<String> result = testable.sort(null);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testEmptyInput() {
        Collection<String> result = testable.sort(new ArrayList<>());

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testInput_1() {
        List<String> input = Stream.of("Fish","DOG", "banana", "fish", "cat", "a", "pineapple", "carrot", "dog").collect(Collectors.toList());
        List<String> expectedOutput = Stream.of("a", "cat", "DOG", "Fish", "banana", "carrot", "pineapple").collect(Collectors.toList());

        Collection<String> result = testable.sort(input);

        assertNotNull(result);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testInput_2() {
        List<String> input = Stream.of("Fish","DOG", "banana", "bin", "fish", "cat", "a", "pineapple", "carrot", "BIN", "dog").collect(Collectors.toList());
        List<String> expectedOutput = Stream.of("a", "bin", "cat", "DOG", "Fish", "banana", "carrot", "pineapple").collect(Collectors.toList());

        Collection<String> result = testable.sort(input);

        assertNotNull(result);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testInput_3() {
        List<String> input = Stream.of("Fish","DOG", "banana", "bin", "fish", "cat", "breakfast", "a", "pineapple", "carrot", "BIN", "dog").collect(Collectors.toList());
        List<String> expectedOutput = Stream.of("a", "bin", "cat", "DOG", "Fish", "banana", "carrot", "breakfast", "pineapple").collect(Collectors.toList());

        Collection<String> result = testable.sort(input);

        assertNotNull(result);
        assertEquals(expectedOutput, result);
    }
}