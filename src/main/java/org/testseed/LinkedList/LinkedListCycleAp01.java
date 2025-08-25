package org.testseed.LinkedList;

import org.testseed.LinkedList.Leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleAp01 {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while(head != null){
            if(visited.contains(head)){
                return head;
            }
            visited.add(head);
            head = head.next;
        }
        return null;
    }
}
