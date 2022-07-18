package com.company.colectii_java.Set;

import com.company.comparatori.ComparatorCuloare;
import com.company.modele.Masina;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AplicatiiHashSet {


    private Set<Masina> masinas;

    public AplicatiiHashSet() {
        masinas = new HashSet<>();

        masinas.add(new Masina(1, "Audi", 2005, "alb"));
        masinas.add(new Masina(2, "Mercedes", 2005, "negru"));
        masinas.add(new Masina(3, "Opel", 2039, "rosu"));
        masinas.add(new Masina(4, "Dacia", 2027, "verde"));
    }

    public void afisare() {
        Iterator<Masina> it = masinas.iterator();
        while (it.hasNext()) {
            Masina t = it.next();
            System.out.println(t);
        }
    }

    public void removeCar(Masina t) {
        this.masinas.remove(t);
    }

}
