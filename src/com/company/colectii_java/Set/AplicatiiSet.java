package com.company.colectii_java.Set;

import com.company.comparatori.ComparatorMarca;
import com.company.modele.Masina;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class AplicatiiSet {

    private Set<Masina> masinas;

    public AplicatiiSet() {
        masinas = new TreeSet<>(new ComparatorMarca());
        masinas.add(new Masina(1, "Audi", 2005, "alb"));
        masinas.add(new Masina(2, "Mercedes", 2015, "negru"));
        masinas.add(new Masina(3, "Opel", 2039, "rosu"));
        masinas.add(new Masina(4, "Dacia", 2027, "verde"));
    }

    public void afisare(){
        Iterator<Masina> it= masinas.iterator();
        while(it.hasNext()){
            Masina t=it.next();
            System.out.println(t);
        }
    }
}
