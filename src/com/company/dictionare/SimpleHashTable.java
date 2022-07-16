package com.company.dictionare;

import java.util.HashMap;

public class SimpleHashTable<K, V> {

    private Entry<K, V>[] table;

    public SimpleHashTable() {
        table = new Entry[10];
    }
    //put

    public void put(K key, V value) {

        int position = hashKay(key);
        if (table[position] == null) {
            Entry<K, V> entryNod = new Entry<>();
            entryNod.setKey(key);
            entryNod.setValue(value);
            table[position] = entryNod;
        } else {

            int stop = position;
            if (position == table.length - 1) {

                position = 0;
            } else {
                position++;
            }

            while (table[position] != null && position != stop) {
                position = (key.toString().length() * 7 + 2) % table.length;
            }

            if (table[position] != null) {
                System.out.println("nu s-a putut adauga");
            } else {
                Entry<K, V> lNod = new Entry<>();
                lNod.setKey(key);
                lNod.setValue(value);
                table[position] = lNod;
            }

        }
    }


    public int hashKay(K key) {
        return (key.toString().length() * 3 + 2) % table.length;
    }

    // de facut find pana maine
    public int find(K key) {

        int hashKey = hashKay(key);

        if (table[hashKey] != null && table[hashKey].getKey().equals(key)) {


            return hashKey;

        }

        int stop = hashKey;
        if (hashKey == table.length - 1) {
            hashKey = 0;
        } else {
            hashKey++;
        }


        while (hashKey != stop && table[hashKey] != null && !table[hashKey].getKey().equals(key)) {
            hashKey = (key.toString().length() * 7 + 2) % table.length;
        }


        if (table[hashKey] != null && table[hashKey].getKey().equals(key)) {

            return hashKey;
        }


        return -1;

    }

    public void afisare() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null)
                System.out.println(table[i].getKey() + " are masina : \n" + table[i].getValue());
        }

    }

    public V delete(K key) {
         int poz=find(key);
         if(poz==-1){

             return  null;
         }
         V value= table[poz].getValue();
         table[poz]=null;
         Entry<K,V> []oldTable=table;

         table= new Entry[10];
         for(int i=0;i<oldTable.length;i++){
              if(oldTable[i]!=null){
                  put(oldTable[i].getKey(),oldTable[i].getValue());
              }
         }

         return value;

    }
}




























