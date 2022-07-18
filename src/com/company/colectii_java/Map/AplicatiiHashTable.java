package com.company.colectii_java.Map;

import com.company.modele.Masina;

import java.util.Iterator;
import java.util.Map;
import java.util.Hashtable;
import java.util.Set;

public class AplicatiiHashTable {
    private Map<String, Masina> masinaMap;

    public AplicatiiHashTable() {
        masinaMap = new Hashtable<>();
        masinaMap.put("Denis", new Masina(1, "Audi", 2007, "verde"));
        masinaMap.put("Antonio", new Masina(2, "Bmw", 2015, "alb"));
        masinaMap.put("Marcel", new Masina(3, "Ferrari", 2011, "gri"));
        masinaMap.put("Vasile", new Masina(4, "Opel", 2005, "albastru"));
        masinaMap.put("Cristian", new Masina(5, "Mercedes", 2019, "rosu"));

    }

    public void afisareKey() {
        Set<String> keys = masinaMap.keySet();
        for (String k : keys) {
            System.out.println(k);
        }
    }

    public void afisareKeyIterator() {
        Iterator<String> it = masinaMap.keySet().iterator();
        while (it.hasNext()) {
            String text = it.next();
            System.out.println(text);
        }
    }

    public void afisareValueIterator() {
        Iterator<Masina> it = masinaMap.values().iterator();
        while (it.hasNext()) {
            Masina t = it.next();
            System.out.println(t);
        }
    }

    public void afisare() {
        Iterator<Map.Entry<String, Masina>> it = masinaMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Masina> mp = it.next();
            System.out.println(mp);
        }
    }
}
