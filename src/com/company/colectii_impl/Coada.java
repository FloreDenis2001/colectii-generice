package com.company.colectii_impl;

public class Coada<T> {

    private Node<T> head = null;

    public void enqueue(T t) {
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

    public void afisare() {
        Node<T> it = head;
        while (it != null) {
            System.out.println(it.getData());
            it = it.getNext();
        }
    }

    public Node<T> dequeue() {
        Node<T> it = head;
        if(head.getNext()==null){

            Node<T>tmp=head;
            head= null;
            return tmp;
        }
        Node<T> r = it.getNext();
            while (it.getNext() != null && it.getNext().getNext() != null) {
                it = it.getNext();
                r = it.getNext();
            }
            it.setNext(null);
            return r;

    }

    public Node<T> peek() {
        Node<T> it = head;
        while (it.getNext() != null) {
            it = it.getNext();
        }
        return it;
    }
}
