package com.gwi.wordsorter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

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
                .collect(toList());

        Sorter<String> stringSorter = SorterFactory.getInstance().createStringSorter();
        System.out.println(String.join(",", stringSorter.sort(words)));
    }
}
