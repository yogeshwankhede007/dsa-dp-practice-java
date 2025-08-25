package org.testseed.LinkedList;

class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Add element at end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // maintain circularity
        }
    }

    // Display circularly
    public void display(int count) {
        Node temp = head;
        for (int i = 0; i < count; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(10);
        cll.add(20);
        cll.add(30);

        cll.display(10); // prints circularly

    }
}

