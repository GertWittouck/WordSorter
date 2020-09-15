package com.gwi.wordsorter;

public class WordComparator implements java.util.Comparator<String> {

    public WordComparator() {
        super();
    }

    public int compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return 0;
        }
        return s1.compareToIgnoreCase(s2);
    }
}
