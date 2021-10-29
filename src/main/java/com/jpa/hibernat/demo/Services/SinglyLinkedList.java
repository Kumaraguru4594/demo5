package com.jpa.hibernat.demo.Services;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglylinkedlist(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;

        head = node;
        tail = node;
        size =1;
        int var=0;
        int master=0;
        int Feat2=0;
        return head;
    }
}
