package com.company.comparatori;

import java.util.Comparator;

public class ComparatorId<T extends Exemplu> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {

        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
