package org.testseed.LinkedList.Leetcode;


public class ReverseLinkedList {
    ListNode head;
    public void reverseList(){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null){
            next = current;
            current = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void insert(int data){
        ListNode newNode = new ListNode(data);
        if (head == null){
            head = newNode;
            return;
        }
    }
}
