package com.company.dictionare;

public class Entry<K, V> implements Comparable<Entry<K, V>> {

    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Entry() {
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    @Override
    public int compareTo(Entry<K, V> o) {
        return 0;
    }

    @Override
    public String toString() {
        String text = "Key : " + this.key + "\n";
        text += "Value : \n" + this.value + "\n";
        return text;
    }
}
