package com.company.comparatori;

import com.company.modele.Masina;

import java.util.Comparator;

public class ComparatorMarca implements Comparator<Masina> {

    @Override
    public int compare(Masina o1, Masina o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}