package com.gwi.wordsorter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordSorter {

    /*
        Write a Java application which takes any number of words as command line arguments
         and outputs unique words (ignoring case)
         in ascending length
         and then alphabetical order (where lengths are the same).
         The original case should be preserved and the outputted words should be comma separated.


         java WordSorter Fish DOG banana fish cat a pineapple carrot dog would produce:
         a, cat, DOG, Fish, banana, carrot, pineapple "
     */

    public static void main(String[] args) {
        List<String> words = Stream.of(args)
                .collect(Collectors.toList());

        // Get unique words ignoring case
        TreeSet<String> seen = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.removeIf(s -> !seen.add(s));

        // Sort by ascending length
        Collections.sort(words, new WordLengthComparator());

        // Sort alphabetical if words are same length
        Collections.sort(words, new WordComparator());

        System.out.println(String.join(",", words));
    }
}
