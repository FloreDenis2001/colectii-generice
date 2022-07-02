package com.company.colectii_impl;

public class Set<T extends Comparable<T>> {

    private Node<T> head = null;

    public void addStart(T t) {
        if (head == null) {
            head = new Node<>();
            head.setData(t);
            head.setNext(null);
        } else {
            Node<T> node = new Node<>();
            node.setData(t);
            node.setNext(head);
            head = node;
        }
    }

    public void addList(T t) {

        int poz = pozitieAdaugareObiect(t);

        if (poz == 0) {
            addStart(t);
        } else {
            addPozitie(poz, t);
        }
    }

    //functie ce imi returneaza pozitia pe care trebuie adaugat
    public int pozitieAdaugareObiect(T t) {
        Node<T> it = head;
        int count = 0;
        while (it != null) {
            if(it.getData().compareTo(t) < 0) {
                it = it.getNext();
                count++;
            }else {
                it=it.getNext();
            }
        }
        return count;
    }

    public void addPozitie(int pozitie, T t) {
        int count = 0;
        Node<T> it = head;
        Node<T> node = new Node<>();
        if (pozitie == 0) {
            node.setData(t);
            node.setNext(head);
            head = node;
        } else {
            while (count < pozitie - 1) {
                it = it.getNext();
                count++;
            }
            node.setData(t);
            node.setNext(it.getNext());
            it.setNext(node);
        }
    }

    public void addSfarsit(T t) {
        Node<T> node = new Node<>();
        Node<T> it = head;
        while (it.getNext() != null) {
            it = it.getNext();
        }
        it.setNext(node);
        node.setNext(null);
        node.setData(t);
    }


    public void afisare() {
        Node<T> it = head;
        while (it != null) {
            System.out.println(it.getData());
            it = it.getNext();
        }
    }


    /*public void addSfarsit(T t) {
        Node<T> node = new Node<>();
        Node<T> it = head;
        while (it.getNext() != null) {
            it = it.getNext();
        }
        it.setNext(node);
        node.setNext(null);
        node.setData(t);
    }*/

    public int findPositionErase(T t) {
        Node<T> it = head;
        int count = 0;
        while (it != null) {
            if (it.getData().compareTo(t) != 0) {
                it = it.getNext();
                count++;
            } else if (it.getData().compareTo(t) == 0) {
                return count;
            }
        }
        return count;
    }

    public void erase(T t) {
        int pozitie = findPositionErase(t);
        int count = 0;
        Node<T> it = head;
        Node<T> prev = null;
        if (pozitie == 0) {
            head = it.getNext();
        } else {
            while (count <= pozitie - 1) {
                prev = it;
                it = it.getNext();
                count++;
            }
            prev.setNext(it.getNext());
        }
    }


    public void updateObject(T t, T nou) {
        Node<T> it = head;
        while (it != null) {
            if (it.getData().compareTo(t) == 0) {
                it.setData(nou);
                it = it.getNext();
            } else {
                it = it.getNext();
            }
        }
    }


}
