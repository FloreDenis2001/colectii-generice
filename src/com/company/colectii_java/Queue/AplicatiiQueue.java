package com.company.colectii_java.Queue;

import com.company.modele.Masina;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class AplicatiiQueue {


    private Queue<Masina> masinas;

    public AplicatiiQueue() {
        masinas = new PriorityQueue<>();
        masinas.offer(new Masina(1, "Audi", 2005, "alb"));
        masinas.offer(new Masina(2, "Mercedes", 2005, "negru"));
        masinas.offer(new Masina(3, "Opel", 2039, "rosu"));
        masinas.offer(new Masina(4, "Dacia", 2027, "verde"));
    }

    public void afisare() {
        Iterator<Masina> it = masinas.iterator();
        while (it.hasNext()) {
            Masina x = it.next();
            System.out.println(x);
        }
    }


    public void removeByMarca(String marca) {
        Iterator<Masina> it = masinas.iterator();
        while (it.hasNext()) {
            Masina t = it.next();
            if (t.getMarca().compareTo(marca) == 0) {
                it.remove();
            }
        }
    }

    public void printFirstElement() {
        Masina t = masinas.peek();
        System.out.println(t);
    }

    public void removeFirst() {
        masinas.poll();
    }



}
