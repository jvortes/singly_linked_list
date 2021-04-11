package com.LickingHeights;

public class SinglyLL {

    protected Node head;
    protected Node tail;
    protected int n;

    public SinglyLL() {
        head = null;
        tail = null;
        n = 0;
    }

    // accessor methods
    public void getHead (Node head) {
        this.head = head;
    }

    public Node setHead() {
        return head;
    }

    public int getSize (int n) {
        // changes if a new node is added or deleted
        return n;
    }

    public void addToHead (int num) {

        // check if list is empty
        // if empty create new node and point head to new node.
        if (head == null) {
            System.out.println("List is empty");
            // Node newNode = new Node(num, null);
            // create head node object
            //  head = newNode;
            head = new Node(num, null); // alternative
        }

        else {
            // list already exists
            // create new node object
            // prepend to head
            Node newNode = new Node(num, head);
            // points head to new node
            head = newNode;
        }

        n++;

    }

        /*
    public void addToTail(int num) {
        // check if list is empty
        if (head == null) {
            System.out.println()
        }
    }

         */

    public void append (int num) {

        // check if list is empty
        if (head == null) {
            System.out.println("List is empty");
            Node newNode = new Node(num, null);
            head = newNode;
        }

        else { // list is not empty.
               // traverse node until null is reached and add to tail

            Node traverse = head;
            while (traverse.next != null) {
                traverse = traverse.next;
            }
            traverse.next = new Node(num, null);

            }

        }


    public void delete (int key) {

        // check for empty list
        if (head == null) {
            System.out.println("list is empty");
        }
        else {

            // only perform deletion if search = key
            if (search(key)) {
                // traverse list until node is found to be deleted
                Node traverse = head;
                Node previous = null;
                if (head.getNum() == key) {
                    // deletes head and points to next node
                    // next node takes place of previous head
                    head = head.getNext();
                    return;

                }

                // Do while loop deletes other items
                // that are not the head. Traverse though nodes
                // to find items.

            do {
                if (traverse.getNum() == key) {
                    // if the key is found
                    // connection between the previous and successor node is made
                    // current node is removed
                    previous.setNext(traverse.getNext());
                    System.out.println("Item deleted");
                    return;
                }
                previous = traverse;
                traverse = traverse.getNext();
            }while(traverse != null);

        } System.out.println("item not found");

        }
    }

    public void searchPrint (int key) {
        // requires search key
        // returns first Node that data matches
        // returns null if matching key is not found

        // check if list is empty
        if (head == null) {
            System.out.println("List is empty");
            // key not found in list
        }

        else {
            Node traverseNode = head;

            do {  if (traverseNode.getNum() == key) {
                return;
            }

            } while (head != null);
        }  System.out.println("Item not found");
    }

    public boolean search (int key) {

        // check for empty list
        if (head == null) {
            return false;
            //System.out.println("list is empty");
        }
        else {
            // traversing the list until we reach null
            // display each node num as traversing
            // start a head and proceed to next null until we reach null
            Node traverse = head; // begins at the beginning

            do {
                if (traverse.getNum() == key) {
                    System.out.println("Item found");
                    return true;
                }
                traverse = traverse.getNext();
                }while(traverse != null);

        } System.out.println("item not found");

        return false;
    }

    public void display () {

        System.out.println();
        // check for empty list
        if (head == null) {
            System.out.println("list is empty");
        }
        else {
            // traversing the list until we reach null
            // display each node num as traversing
            // start a head and proceed to next null until we reach null
            Node traverse = head; // begins at the beginning
            System.out.print("List = { " + head.getNum() + " -> ");
            while (traverse.getNext() != null) {

                traverse = traverse.getNext();
                // move forward by one position
                System.out.print(traverse.getNum() + " -> ");
            }
            System.out.print("-| null }");

        }
    }

    public void deletePosition (int key) {

        // check if list is empty
        // cannot delete data from empty list
        // exit method
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        // if position is 0, remove node
        Node traverse = head;
        if (key == 0) {
            // Head node removed.
            // traverse.next points to the position of the successor node.
            head = traverse.next;
            return;
        }

        else { // if not the head node find the previous position
                // of the node to be deleted.
            for (int i = 0; traverse != null && i < key - 1; i++) {
                traverse = traverse.next;
            }

            // check if key exists or if key is greater than the number of nodes
            if (traverse == null || traverse.next == null)
                return;

        }
    }
}
