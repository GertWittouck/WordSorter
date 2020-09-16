package com.gwi.wordsorter;

public class WordLengthComparator implements java.util.Comparator<String> {

    public WordLengthComparator() {
        super();
    }

    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
