package org.testseed.LinkedList.Leetcode;

public class ListNode {
    int data;
    ListNode prev;
    ListNode current;
    public ListNode next;

    ListNode(int data){
        this.data = data;
        this.prev = null;
        this.current = null;
        this.next = null;
    }
}
