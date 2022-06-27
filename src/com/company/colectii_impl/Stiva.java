package com.company.colectii_impl;

public class Stiva<T> {

    private Node<T> head = null;


    public void push(T t) {
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

    public Node<T> pop() {
        Node<T> it = head;
        head=it.getNext();
        return it;
    }

    public Node<T> peek() {
        return this.head;
    }


}
