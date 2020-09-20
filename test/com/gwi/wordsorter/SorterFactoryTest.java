package com.gwi.wordsorter;

import org.junit.Test;

import static org.junit.Assert.*;

public class SorterFactoryTest {

    @Test
    public void testGetStringSorter() {
        assertTrue(SorterFactory.getInstance().createStringSorter() instanceof StringSorter);
    }

}