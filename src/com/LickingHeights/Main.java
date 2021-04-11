package com.LickingHeights;

public class Main {

    public static void main(String[] args) {

        SinglyLL myList = new SinglyLL();

        myList.addToHead(5);
        myList.addToHead(6);
        myList.addToHead(10);
        myList.append(25);
        myList.display();
        myList.deletePosition(1);
        myList.display();

    }
}
