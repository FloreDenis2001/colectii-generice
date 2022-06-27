package com.company.comparatori;

import com.company.modele.Person;

import java.util.Comparator;

public class ComparatorPrenume implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPrenume().compareTo(o2.getPrenume());
    }
}
