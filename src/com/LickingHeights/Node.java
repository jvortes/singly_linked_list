package com.LickingHeights;

public class Node {

    protected int num;
    protected Node next; // memory address to the next node

    // creates new node object and initializes it's values.
    public Node(int num, Node next) {
        this.num = num;
        this.next = next;
    }


    public void setNum (int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public Node getNext() {
        return next;
    }

    public void setNext (Node next) {
        this.next = next;
    }

}
