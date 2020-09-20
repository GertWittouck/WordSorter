package com.gwi.wordsorter;

import java.util.Collection;

public interface Sorter<T> {

    Collection<T> sort(Collection<T> items);
}
