package com.gwi.wordsorter;

public final class SorterFactory {

    private static SorterFactory instance;

    public static SorterFactory getInstance() {
        if (instance == null) {
            instance = new SorterFactory();
        }
        return instance;
    }

    private SorterFactory () { super(); }

    public Sorter<String> createStringSorter() {
        return new StringSorter();
    }
}
