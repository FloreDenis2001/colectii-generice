package com.company.dictionare;

import com.company.colectii_impl.Lista;

import java.util.HashMap;


public class HashTable<K, V> {
    private Lista<Entry<K, V>>[] table;

    public HashTable() {
        table = new Lista[10];
        for (int i = 0; i < 10; i++) {
            table[i] = new Lista<>();
        }
    }

    public int hasKey(K key) {
        return (key.toString().length() * 2 + 3) % table.length;
    }

    public void put(K key, V value) {
        int position = hasKey(key);
        table[position].add(new Entry<>(key, value));
    }

    public void print() {
        for (int i = 0; i < 10; i++) {
            table[i].afisareLista();
        }
    }


    public int find(K key) {
        int pozitie = hasKey(key);
        for (int i = 0; i < table[pozitie].sizeList(); i++) {
            if (table[pozitie].get(i).getKey().equals(key)) {

                return i;
            }
        }
        return -1;
    }

    public V get(K key) {

        int pozitia = hasKey(key);
        int pozitieLista = find(key);
        if (pozitieLista != -1) {
            return table[pozitia].get(pozitieLista).getValue();
        }
        return null;
    }

    public void remove(K key) {
        int pozitia = hasKey(key);
        int pozitieLista = find(key);
        if (pozitieLista != -1) {
            table[pozitia].erase(pozitieLista);
        }

    }
}