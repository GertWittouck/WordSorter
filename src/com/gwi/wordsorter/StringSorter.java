package com.gwi.wordsorter;

import java.util.*;

public class StringSorter implements Sorter<String> {

    @Override
    public Collection<String> sort(Collection<String> items) {
        if (items == null || items.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> words = new ArrayList<>(items);

        Set<String> seen = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.removeIf(s -> !seen.add(s));

        // Sort by ascending length
        words.sort((Comparator.comparingInt(String::length)));

        // Sort alphabetical if words are same length
        words.sort(new WordComparator());

        return words;
    }
}
