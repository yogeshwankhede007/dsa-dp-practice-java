package org.testseed.LinkedList;

import org.testseed.LinkedList.Leetcode.ListNode;

public class RemoveNthNodeFromEndBF {

    public ListNode removeNthNode(ListNode head, int n){
        if (head == null) return  null;

        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        int pos = len - n;
        if (pos == 0) return  head.next;
        temp = head;
        for (int i =1; i < pos; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
