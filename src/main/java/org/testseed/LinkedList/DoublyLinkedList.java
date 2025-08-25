package org.testseed.LinkedList;

public class DoublyLinkedList {
    private Node head;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }


}
