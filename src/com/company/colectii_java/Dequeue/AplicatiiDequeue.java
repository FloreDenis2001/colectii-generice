package com.company.colectii_java.Dequeue;

import com.company.colectii_java.Queue.AplicatiiQueue;
import com.company.modele.Masina;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class AplicatiiDequeue {

    private Deque<Masina> masinas;

    public AplicatiiDequeue(){
        masinas=new ArrayDeque<>();
        masinas.offerLast(new Masina(1, "Audi", 2005, "alb"));
        masinas.offerLast(new Masina(2, "Mercedes", 2005, "negru"));
        masinas.offerLast(new Masina(3, "Opel", 2039, "rosu"));
        masinas.offerFirst(new Masina(4, "Dacia", 2027, "verde"));
    }

    public void afisare() {
        Iterator<Masina> it = masinas.iterator();
        while (it.hasNext()) {
            Masina x = it.next();
            System.out.println(x);
        }
    }

    public void poolFirst(){
        masinas.pollFirst();
    }
    public void poolLast(){
        masinas.pollLast();
    }
    public void peekFirst(){
        Masina t =masinas.peekFirst();
        System.out.println(t);
    }
    public void peekLast(){
       Masina p= masinas.peekLast();
        System.out.println(p);
    }
}
