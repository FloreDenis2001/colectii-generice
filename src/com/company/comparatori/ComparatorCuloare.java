package com.company.comparatori;

import com.company.modele.Masina;

import java.util.Comparator;

public class ComparatorCuloare implements Comparator<Masina> {

    @Override
    public int compare(Masina o1, Masina o2) {
        return o1.getCuloare().compareTo(o2.getCuloare());
    }
}
