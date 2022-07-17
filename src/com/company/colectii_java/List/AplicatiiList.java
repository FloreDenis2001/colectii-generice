package com.company.colectii_java.List;

import com.company.colectii_impl.Lista;
import com.company.modele.Masina;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AplicatiiList {

    private List<Masina> masinas;

    public AplicatiiList() {
        masinas = new ArrayList<>();
        masinas.add(new Masina(1, "Audi", 2005, "alb"));
        masinas.add(new Masina(2, "Mercedes", 2015, "negru"));
        masinas.add(new Masina(3, "Opel", 2039, "rosu"));
        masinas.add(new Masina(4, "Dacia", 2027, "verde"));
    }


    public void afisareIterable() {

        Iterator<Masina> it = masinas.iterator();

        while (it.hasNext()) {

            Masina m = it.next();//returneaza nodul la care sunt si trece al urmatorul
            System.out.println(m);
        }
    }

    public Masina ceaMaiNouaMasinaIterable() {
        Iterator<Masina> it = masinas.iterator();
        Masina t = masinas.get(0);
        while (it.hasNext()) {
            Masina p = it.next();
            if (t.compareTo(p) < 0) {
                 t=p;
            }
        }
        return t;
    }

    public Masina penultimaCeeaMaiMare(){
        Iterator<Masina> it = masinas.iterator();
        Masina  anMaxim=masinas.get(0);
        Masina penMaxim=new Masina(1,"BMW",1990,"verde");
        while (it.hasNext()) {
            Masina p = it.next();

            if (p.compareTo(anMaxim) > 0) {
                penMaxim = anMaxim;
                anMaxim = p;
            } else if (p.compareTo(penMaxim) > 0 && p.equals(anMaxim) == false && p.compareTo(anMaxim) < 0){
                penMaxim=p;
            }



        }
        return penMaxim;
    }



    //returneaza pozitia

    public int pozitieByMarca(String marca){
        Iterator<Masina> it= masinas.iterator();
        int count = 0;
        while(it.hasNext()){
            Masina t =it.next();
            if(t.getMarca().compareTo(marca)==0){
                return count;
            }else {
                count++;
            }
        }
        return 0;
    }

    //Cu ListIterator
    public int pozitieByMarca2(String marca){
        ListIterator<Masina> it=masinas.listIterator();
        while(it.hasNext()){
            Masina t =it.next();
            if(t.getMarca().compareTo(marca)==0){
                return it.nextIndex()-1;
            }
        }
        return 0;
    }




    public void removeByMarca(String marca){
        Iterator<Masina> it= masinas.iterator();
        while (it.hasNext()){
            Masina t=it.next();
            if(t.getMarca().compareTo(marca)==0){
                it.remove();
            }
        }
    }

    public void addSfarsit(Masina x){
        ListIterator<Masina> it= masinas.listIterator();
        while(it.hasNext()){
            it.next();
        }
         it.add(x);
    }



}